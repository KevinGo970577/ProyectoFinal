package Tienda;

import Productos.Bebida;
import Productos.Producto;
import Productos.ProductoNoPerecedero;
import Productos.ProductoPerecedero;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Venta {
    private String id;
    private int ventasHechas;
    private Producto producto;
    private int cantidad;
    private Empleado empleado;
    private LocalDateTime fecha;
    private double total;
    private static List<Venta> historialVentas = new ArrayList<>();

    public Venta() {
    }

    public Venta(Producto producto, int cantidad, Empleado empleado, LocalDateTime fecha, double total) {
        this.id = UUID.randomUUID().toString();
        this.producto = producto;
        this.cantidad = cantidad;
        this.empleado = empleado;
        this.fecha = fecha;
        this.total = total;
    }

    public static List<Venta> getHistorialVentas() {
        return historialVentas;
    }

    public static void setHistorialVentas(List<Venta> historialVentas) {
        Venta.historialVentas = historialVentas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVentasHechas() {
        return ventasHechas;
    }

    public void setVentasHechas(int ventasHechas) {
        this.ventasHechas = ventasHechas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        String infoAdicional = "";
        if (producto instanceof ProductoPerecedero perecedero) {
            infoAdicional = "Caducidad: " + perecedero.getFechaCaducidad();
        } else if (producto instanceof ProductoNoPerecedero noPerecedero) {
            infoAdicional = "Garantía (meses): " + noPerecedero.getGarantiaMeses();
        } else if (producto instanceof Bebida bebida) {
            if (bebida.isAlcoholica()) {
                infoAdicional = "Mililitros: " + bebida.getMililitros() +
                        "\nAlcoholica: si";
            } else if (!bebida.isAlcoholica()) {
                infoAdicional = "Mililitros: " + bebida.getMililitros() +
                        "\nAlcoholica: no";
            }
        }

        return "Venta # " + id +
                "\nProducto: " + producto.getNombre() +
                "\nCantidad: " + cantidad +
                "\n" + infoAdicional +
                "\nTotal: $" + total +
                "\nEmpleado: " + empleado.getNombre() +
                "\nFecha: " + fecha.toString();
    }
}
