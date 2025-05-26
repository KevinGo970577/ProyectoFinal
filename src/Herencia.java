public abstract class Herencia {
    public Herencia() {
        super();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    String nombre;
    String color;
    String tipo;
    String tamano;
    double precio;

    public Herencia(String nombre, String color, String tipo, String tamano, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }
}
