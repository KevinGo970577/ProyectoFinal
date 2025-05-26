package Productos;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private LocalDate fechaCaducidad;

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String id, String nombre, String marca, double precio, int cantidad, LocalDate fechaCaducidad) {
        super(id, nombre, marca, precio, cantidad, true);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoPerecedero{" +
                "fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
