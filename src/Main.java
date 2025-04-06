
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Vehículos - Etapa 1 ---");

        try {

            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Ford", 2019, 600.5);
            Vehiculo vehiculo2 = new Vehiculo(" AE 456 FG ", "Toyota", 2021, 750.0); // Patente con espacios
            Vehiculo vehiculo3 = new Vehiculo("GH789IJ", "Fiat", 2020, 450.75);


            System.out.println("\nVehículos creados:");
            vehiculo1.mostrarInformacion();
            vehiculo2.mostrarInformacion();
            vehiculo3.mostrarInformacion();



        } catch (IllegalArgumentException e) {

            System.err.println("\nError creando vehículo: " + e.getMessage());
        } catch (Exception e) {

            System.err.println("\nOcurrió un error inesperado: " + e.getMessage());
            e.printStackTrace(); // Imprime más detalles del error
        }

        System.out.println("\n--- Fin Etapa 1 ---");
    }
}
