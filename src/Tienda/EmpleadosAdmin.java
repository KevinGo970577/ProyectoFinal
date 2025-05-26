package Tienda;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosAdmin {
    List<Empleado> empleados;

    public EmpleadosAdmin() {
        empleados = new ArrayList<>();
    }

    public EmpleadosAdmin(List<Empleado> lstEmpleados) {
        this.empleados = lstEmpleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void contratar (Empleado e) {
        empleados.add(e);
        System.out.println(e.getNombre()  + " ha sido registrado con exito");
    }

    public void despedir (String id, String nombre) throws InterruptedException {
        if (!empleados.isEmpty()) {
            empleados.removeIf(e -> e.getId().equals(id));
            System.out.println("El empleado " + nombre + " ha sido despedido exitosamente.");
            Thread.sleep(3000);
        } else {
            System.out.println("No hay empleados contratados.");
        }
    }

    public void enlistarEmpleados () {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}
