import Productos.*;
import Tienda.*;
import java.time.*;
import java.util.*;

import static java.awt.SystemColor.menu;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);
    private static final List<Producto> lstProductos = new ArrayList<Producto>();
    private static final List<Empleado> lstEmpleados = new ArrayList<Empleado>();
    private static final EmpleadosAdmin administracion= new EmpleadosAdmin();
    private static final MenuJefe menuJefe = new MenuJefe(administracion);
    private static final Inventario inventario = new Inventario();
    private static int intentos = 0;

    public static void main(String[] args) throws InterruptedException{
        iniciarProductos();
        iniciarEmpleados();
        System.out.print("Presione enter para iniciar.");
        teclado.nextLine();
        iniciarSesion();
    }

    private static void iniciarProductos() {
        // Bebidas
        Bebida cocaCola = new Bebida("coc", "Coca-Cola", "Coca-Cola", 2200, 30, 400, false);
        Bebida cervezaAguila = new Bebida("cer", "Cerveza", "Aguila", 3500, 50, 330, true);
        Bebida jugoHit = new Bebida("jht", "Jugo de Mango", "Hit", 1800, 20, 250, false);
        Bebida pepsi = new Bebida("pes", "Pepsi", "Pepsi", 2000, 25, 350, false);

        // Productos Perecederos
        ProductoPerecedero queso= new ProductoPerecedero("qso", "Queso Colanta", "Colanta", 3200, 50, LocalDate.of(2026,7,2));
        ProductoPerecedero lecheAlqueria = new ProductoPerecedero("lqa", "Leche Entera", "Alquería", 3000, 40, LocalDate.of(2026, 6, 10));
        ProductoPerecedero yogurYogoYogo = new ProductoPerecedero("ygy", "Yogur Fresa", "Yogo Yogo", 1500, 60, LocalDate.of(2026, 6, 5));
        ProductoPerecedero panBimbo = new ProductoPerecedero("pnb", "Pan Blanco", "Bimbo", 2800, 35, LocalDate.of(2026, 5, 25));
        ProductoPerecedero carneRes = new ProductoPerecedero("crn", "Carne de Res", "Carnes La 14", 9500, 15, LocalDate.of(2026, 5, 21));

        // Productos No Perecederos
        ProductoNoPerecedero detergenteAriel = new ProductoNoPerecedero("dta", "Detergente", "Ariel", 7800, 25, 2);
        ProductoNoPerecedero cremaDental = new ProductoNoPerecedero("crd", "Crema Dental", "Colgate", 4200, 45, 1);
        ProductoNoPerecedero jabonRopa = new ProductoNoPerecedero("jrp", "Jabón en barra", "Fab", 1500, 70, 3);
        ProductoNoPerecedero papelHigienico = new ProductoNoPerecedero("pph", "Papel Higienico", "Familia", 2000, 38, 4);

        List<Producto> productos = Arrays.asList(cocaCola, cervezaAguila, jugoHit, pepsi, queso, lecheAlqueria, yogurYogoYogo, panBimbo, carneRes,
                detergenteAriel, cremaDental, jabonRopa, papelHigienico);
        lstProductos.addAll(productos);
        inventario.setProductos(lstProductos);
    }

    private static void iniciarEmpleados() {
        Empleado jefe = new Empleado("2431", "030824","felipe", "jefe", 0);
        Empleado cajero = new Empleado("4568", "12345", "juan", "empleado", 0);
        Empleado cajero2 = new Empleado("9587", "58798", "karen", "empleado", 0);
        lstEmpleados.addAll(List.of(jefe, cajero, cajero2));
        administracion.setEmpleados(lstEmpleados);
    }

    private static void iniciarSesion() throws InterruptedException{
        if (intentos < 3) {
            try {
                System.out.print("Bienvenido a Alcachofas Super." +
                        "\n-------------------------------------------" +
                        "\nIngrese su usuario (Id o nombre): => ");
                String identificador = teclado.nextLine().toLowerCase();
                System.out.print("Ingrese su contraseña: => ");
                String password = teclado.nextLine();
                boolean encontrado = false;
                for (Empleado e : lstEmpleados) {
                    if (e.getId().equals(identificador) && e.getContrasenia().equals(password)) {
                        encontrado = true;
                        if (e.getPuesto().equals("jefe")) {
                            MenuJefe.mostrarMenu(e.getNombre());
                            intentos = 0;
                            iniciarSesion();
                        } else if (e.getPuesto().equals("empleado")) {
                            MenuEmpleado.inicializar(inventario, e);
                            MenuEmpleado.mostrarMenu();
                            intentos = 0;
                            iniciarSesion();
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("El usuario o contraseña son incorrectos, verifique e intente nuevamente.");
                    intentos++;
                    System.out.println("Intentos restantes = " + (3 - intentos));
                    for (int i = 0; i < 3; i++) {
                        System.out.print(". ");
                        Thread.sleep(1000);
                    }
                    System.out.println();
                    iniciarSesion();
                }
            } catch (Exception e) {
                teclado.nextLine();
                System.out.println("Ha habido un error, se reiniciará el programa.");
                Thread.sleep(1000);
                iniciarSesion();
            }
        } else {
            System.out.println("Ha excedido el numero de intentos disponible." +
                    "\nHable con su asesor para preestablecer el sistema de intentos.");
            while (true) {
                System.out.print("Ingrese el código de seguridad. => ");
                String code = teclado.nextLine();
                String security = menuJefe.getSecurityCode();
                if (code.equals(security)) {
                    intentos = 0;
                    iniciarSesion();
                    break;
                } else {
                    System.out.print("Ese no es el código.");
                }
            }
        }
    }
}
