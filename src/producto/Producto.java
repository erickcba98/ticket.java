package producto;

public class Producto {

    private final int idProducto;
    private static int contadorProducto;
    private String nombre;
    private double precio;

    private Producto() {
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(idProducto);
        sb.append("  ").append(nombre);
        sb.append("\t$").append(precio);
        return sb.toString();
    }


}
