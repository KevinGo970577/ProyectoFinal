package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String id;
    private String contrasenia;
    private String nombre;
    private String puesto;
    private double salario = 1000000;
    private int ventas;
    private List<Venta> ventasRealizadas = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(String id, String contrasenia, String nombre, String puesto, int ventas) {
        this.id = id;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.puesto = puesto;
        this.ventas = ventas;
        if (puesto.equals("jefe")) {
            salario = 3000000;
        }
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Venta> getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(List<Venta> ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public void agregarVenta(Venta venta) {
        ventas ++;
        ventasRealizadas.add(venta);
    }

    public double calcularSalario() {
        double comisionTotal = 0;
        for (Venta venta : ventasRealizadas) {
            comisionTotal += venta.getTotal() * 0.05;
        }
        return salario + comisionTotal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
