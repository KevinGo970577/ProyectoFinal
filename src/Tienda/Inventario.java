package Tienda;
import Productos.Producto;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public Inventario(List<Producto> lstProductos) {
        this.productos = lstProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto (Producto p) {
        productos.add(p);
    }

    public void eliminarProducto (String id) {
        if (!productos.isEmpty()) {
            productos.removeIf(p -> id.equals(p.getId()));
        } else {
            System.out.println("El inventario esta vacio.");
        }
    }

    public void buscarProducto (String id) {
        if (!productos.isEmpty()) {
            for (Producto p : productos) {
                System.out.println(p);
            }
        } else {
            System.out.println("El inventario esta vacio.");
        }
    }
}
