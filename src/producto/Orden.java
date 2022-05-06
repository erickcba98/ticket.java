package producto;

public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private Producto productos[];
    private int contadorProductos;
    private final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Limite de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("ID Orden: " + this.idOrden);

        System.out.println("Productos de la orden: ");
        System.out.println("\nN° Producto \tPrecio\n");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        double totalOrden = Math.round(this.calcularTotal() * 100.0) / 100.0;
        System.out.println("\n\t TOTAL: $" + totalOrden);
        System.out.println("-----------------------------------------");
    }
}
