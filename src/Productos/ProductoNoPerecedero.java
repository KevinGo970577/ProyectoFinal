package Productos;

public class ProductoNoPerecedero extends Producto{
    private int garantiaMeses;

    public ProductoNoPerecedero() {
    }

    public ProductoNoPerecedero(String id, String nombre, String marca, double precio, int cantidad, int garantiaMeses) {
        super(id, nombre, marca, precio, cantidad, false);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoNoPerecedero{" +
                "garantiaMeses=" + garantiaMeses +
                '}';
    }


}
