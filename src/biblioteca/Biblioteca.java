package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        // =========================
        // CREACIÓN DE LOS LIBROS
        // =========================

        Libro libro1 = new Libro(
                "Clean Code",
                "Robert C. Martin",
                "9780132350884"
        );

        Libro libro2 = new Libro(
                "Efectivo con Java",
                "Ana Restrepo",
                "9781234567897",
                3,
                22000.0
        );

        Libro libro3 = new Libro(
                "Cien Años de Soledad",
                "Gabriel García Márquez",
                "9780307474728",
                2,
                18500.0
        );

        Libro libroInvalido = new Libro(
                "",
                "Autor de prueba",
                "ISBN-000",
                1,
                15000.0
        );

        System.out.println(
                "Título guardado: " + libroInvalido.getTitulo()
        );

        // PROBAR PRECIO INVÁLIDO

        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);

        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)");

        System.out.println("Precio actual: $" + libro1.getPrecioReposicion());


        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();


        System.out.println("=== Prueba de préstamos ===");

        boolean prestamo1 = libro1.prestar();

        System.out.println("¿Se pudo realizar el préstamo? " + prestamo1);

        // Intentar prestar cuando ya no quedan copias
        boolean prestamo2 = libro1.prestar();

        System.out.println("¿Se pudo realizar otro préstamo? " + prestamo2);

        // DEVOLVER EL LIBRO

        libro1.devolver();

        // ACTUALIZAR PRECIO

        double precioAnterior = libro1.getPrecioReposicion();

        boolean nuevoPrecioAceptado = libro1.setPrecioReposicion(18000.0);

        if (nuevoPrecioAceptado) {

            System.out.println("Precio de reposición actualizado de " + "\"Clean Code\": $" + precioAnterior + " -> $" + libro1.getPrecioReposicion());
        }
    }
}