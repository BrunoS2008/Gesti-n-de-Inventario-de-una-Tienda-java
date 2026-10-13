package FlotalLogistica;

public class MainFlota {

    public static void main(String[] args) {

        System.out.println("=== Reporte de Operaciones de Flota ===");

        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AA123BB", "Scania", 450, 18.0);

        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz",
                416.6666667, true);

        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180);

        double costoTotal = 0;

        for (Vehiculo v : flota) {

            v.mostrarFicha();

            double costo = v.calcularCostoViaje(150.0);

            System.out.println("Costo de viaje (150.0 km): $" + costo);

            costoTotal = costoTotal + costo;

            System.out.println("--------------------------------------------------");
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}
