package Tienda;

import java.util.Scanner;

public class MenuJefe {
    private static EmpleadosAdmin administrador;
    private static final Scanner teclado = new Scanner(System.in);
    private static String securityCode = "000000";

    public MenuJefe(EmpleadosAdmin administracion) {
        administrador = administracion;
    }

    public static EmpleadosAdmin getAdministrador() {
        return administrador;
    }

    public static void setAdministrador(EmpleadosAdmin administrador) {
        MenuJefe.administrador = administrador;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        MenuJefe.securityCode = securityCode;
    }

    public static void mostrarMenu(String nombre) throws InterruptedException {
        boolean menu = true;
        while (menu) {
            System.out.print("-------------------------------------------" + "\nHola " + nombre + "\n-------------------------------------------" +
                    "\nQue desea realizar?:" +
                    "\n1. Contratar Empleado" +
                    "\n2. Despedir Empleado" +
                    "\n3. Ver ventas y salario de empleados" +
                    "\n4. Cambiar código de seguridad" +
                    "\n5. Cerrar sesion. => ");
            int opc = teclado.nextInt();
            teclado.nextLine();
            System.out.println("-------------------------------------------");
            try {
                switch (opc) {
                    case 1 -> {
                        if (administrador.getEmpleados().size() < 3) {
                            contratarEmpleado();
                        } else {
                            System.out.println("No hay vacantes disponibles.");
                            Thread.sleep(1000);
                        }
                    }
                    case 2 -> {
                        despedirEmpleado();
                    }
                    case 3 -> {
                        verEstadisticas();
                    }
                    case 4 -> {
                        nuevoCodigo();
                    }
                    case 5 -> {
                        menu = false;
                    }
                }

            } catch (Exception e) {
                teclado.nextLine();
                System.out.println("Ha habido un error, se reiniciará el programa.");
                Thread.sleep(1000);
            }
        }
    }

    private static void nuevoCodigo() throws InterruptedException {
        System.out.print("Ingrese el código de seguridad anterior. => ");
        String code = teclado.nextLine();
        if (code.equals(securityCode)) {
            System.out.print("Digite el nuevo código. => ");
            securityCode = teclado.nextLine();
            System.out.println("El código ha sido cambiado correctamente. \nEl nuevo código es: " + securityCode);
            Thread.sleep(3000);
        }
    }

    private static void verEstadisticas() throws InterruptedException {
        int i = 1;
        for (Empleado e : administrador.getEmpleados()) {
            System.out.println("*** " + e.getNombre() + ", Ventas: " + e.getVentas() +
                    ", Salario: " + e.calcularSalario() + " ***");
        }
        Thread.sleep(3000);
    }

    private static void despedirEmpleado() throws InterruptedException {
        System.out.println("Empleados contratados: ");
        int i = 0;
        for (Empleado e : administrador.getEmpleados()) {
            if (!e.getPuesto().equals("jefe")) {
                System.out.print((i + 1) + ". Nombre=" + e.getNombre() + ", ID=" + e.getId() + "\n");
                i++;
            }
        } System.out.println("-------------------------------------------");
        boolean id = true;
        while (id) {
            System.out.print("Ingrese el ID del empleado. => ");
            String elec = teclado.nextLine();
            boolean encontrado = false;
            for (Empleado e : administrador.getEmpleados()) {
                if (e.getId().equals(elec)) {
                    encontrado = true;
                    if (e.getPuesto().equals("jefe")) {
                        System.out.println("Este es un jefe, ¿cómo lo va a despedir animal?");
                        Thread.sleep(1000);
                        break;
                    }
                    while (true) {
                        System.out.print("¿Seguro que quiere despedir al empleado? S/N => ");
                        char decision = teclado.nextLine().toLowerCase().charAt(0);
                        if (decision == 's') {
                            administrador.despedir(elec, e.getNombre());
                            id = false;
                            break;
                        } else if (decision == 'n') {
                            id = false;
                            break;
                        } else {
                            System.out.println("Esa no es una opción.\n-------------------------------------------");
                        }
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No hay ningún empleado registrado con ese ID.");
            }
        }
    }

    private static void contratarEmpleado() {
        while (true) {
            System.out.print("Ingrese el codigo de seguridad. => ");
            String code = teclado.nextLine();
            if (!code.equals(securityCode)) {
                System.out.println("Ese no es el código correcto. Intente nuevamente.");
            } else {
                break;
            }
        }
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine().toLowerCase();
        System.out.print("Ingrese el ID del empleado: ");
        String id = teclado.nextLine();
        System.out.print("Ingrese el puesto a emplear: ");
        String puesto = teclado.nextLine().toLowerCase();
        System.out.print("Ingrese la contraseña del empleado: ");
        String contrasenia = teclado.nextLine().toLowerCase();
        Empleado empleado = new Empleado(id, contrasenia, nombre, puesto, 0);
        administrador.contratar(empleado);
    }
}
