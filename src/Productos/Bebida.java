package Productos;

public class Bebida extends Producto{
    private double mililitros;
    private boolean alcoholica;

    public Bebida() {
    }

    public Bebida(String id, String nombre, String marca, double precio, int cantidad, double mililitros, boolean alcoholica) {
        super(id, nombre, marca, precio, cantidad, false);
        this.mililitros = mililitros;
        this.alcoholica = alcoholica;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }

    public boolean isAlcoholica() {
        return alcoholica;
    }

    public void setAlcoholica(boolean alcoholica) {
        this.alcoholica = alcoholica;
    }

    @Override
    public String toString() {
        return super.toString() + " Bebida{" +
                "mililitros=" + mililitros +
                ", alcoholica=" + alcoholica +
                '}';
    }
}
