package inventario;

public class Producto {

    // Atributos
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    // Método para vender unidades
    public void venderUnidades(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
        } else if (cantidad > stock) {
            System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
        } else {
            stock = stock - cantidad;

            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        }
    }

    // Método para reponer stock
    public void reponerStock(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        } else {
            stock = stock + cantidad;

            System.out.println("Reposición registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        }
    }

    // Método para actualizar el precio
    public void actualizarPrecio(double precio) {

        double precioAnterior = this.precio;

        this.precio = precio;

        System.out.println("Precio actualizado de " + nombre + ": " + precioAnterior + " -> " + this.precio);
    }

    // Método para mostrar los datos
    public void mostrarFicha() {

        System.out.println("=== Ficha de producto ===");
        System.out.println("Código:  " + codigo);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:   " + stock);
        System.out.println("==========================");
    }
}