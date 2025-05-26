package Tienda;

import Productos.Producto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class MenuEmpleado {
    private static final Scanner teclado = new Scanner(System.in);
    private static Inventario inventario;
    private static Empleado empleado;

    public static void inicializar(Inventario inv, Empleado emp) {
        inventario = inv;
        empleado = emp;
    }

    public static void mostrarMenu() throws InterruptedException {
        int opcion;
        do {
            System.out.println("\nMENÚ EMPLEADO");
            System.out.println("1. Realizar venta");
            System.out.println("2. Ver historial de ventas");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción => ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1 -> realizarVenta();
                case 2 -> mostrarHistorial();
                case 3 -> {
                    System.out.println("Cerrando sesión...");
                    opcion = 0;
                }
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void realizarVenta() throws InterruptedException {
        System.out.println("Realizar Venta");
        List<Producto> productos = inventario.getProductos();
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - $" + p.getPrecio() + " (Stock: " + p.getCantidad() + ")");
        }
        System.out.print("Ingrese el ID del producto a vender => ");
        String idProducto = teclado.nextLine().toLowerCase();
        Producto seleccionado = null;
        for (Producto p : productos) {
            if (p.getId().equals(idProducto)) {
                seleccionado = p;
                break;
            }
        }
        if (seleccionado == null) {
            System.out.println("Producto no encontrado.");
            return;
        }
        System.out.print("Ingrese la cantidad a vender => ");
        int cantidad = Integer.parseInt(teclado.nextLine());
        if (cantidad <= 0 || cantidad > seleccionado.getCantidad()) {
            System.out.println("Cantidad inválida o insuficiente stock.");
            return;
        }
        double total = cantidad * seleccionado.getPrecio();
        Venta venta = new Venta(seleccionado, cantidad, empleado, LocalDateTime.now(), total);
        Venta.getHistorialVentas().add(venta);
        seleccionado.setCantidad(seleccionado.getCantidad() - cantidad);
        System.out.println("Venta realizada exitosamente:\n" + venta);
        empleado.agregarVenta(venta);
        Thread.sleep(3000);
    }

    private static void mostrarHistorial() throws InterruptedException {
        System.out.println("\nHISTORIAL DE VENTAS");
        List<Venta> historial = Venta.getHistorialVentas();
        if (historial.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta v : historial) {
                System.out.println(v + "\n");
            }
        }
        Thread.sleep(3000);
    }
}
