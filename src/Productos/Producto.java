package Productos;

public class Producto {
    private String id;
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;
    private boolean isPerecedero;

    public Producto() {
    }

    public Producto(String id, String nombre, String marca, double precio, int cantidad, boolean isPerecedero) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.isPerecedero = isPerecedero;
    }

    public boolean isPerecedero() {
        return isPerecedero;
    }

    public void setPerecedero(boolean perecedero) {
        isPerecedero = perecedero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void reducirCantidad(int compra) {
        this.cantidad =- cantidad - compra;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
