package inventario;

public class Inventario {

    public static void main(String[] args) {


        Producto productoUno = new Producto();
        Producto productoDos = new Producto();
        Producto productoTres = new Producto();

        productoUno.codigo = "P-1";
        productoUno.nombre = "Teclado mecánico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        productoDos.codigo = "P-2";
        productoDos.nombre = "Mouse inalámbrico";
        productoDos.precio = 25000.0;
        productoDos.stock = 20;

        productoTres.codigo = "P-3";
        productoTres.nombre = "Auriculares";
        productoTres.precio = 35000.0;
        productoTres.stock = 15;

        productoUno.mostrarFicha();

        productoUno.venderUnidades(3);

        productoUno.venderUnidades(50);

        productoUno.reponerStock(20);

        productoUno.actualizarPrecio(39900.0);

        // Mostrar que los otros objetos no fueron modificados
        System.out.println();
        System.out.println("=== Otros productos ===");

        productoDos.mostrarFicha();
        productoTres.mostrarFicha();


        Producto copia = productoUno;

        copia.stock = 29;

        System.out.println();
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");
        //heap guarda los objetos creados por new.
    }
}
