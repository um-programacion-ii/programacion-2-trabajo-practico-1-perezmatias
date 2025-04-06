
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Vehículos - Etapa 2 (SRP) ---");

        VehiculoPrinter printer = new VehiculoPrinter();

        try {

            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Ford", 2019, 600.5);
            Vehiculo vehiculo2 = new Vehiculo("AE456FG", "Toyota", 2021, 750.0);
            Vehiculo vehiculo3 = new Vehiculo("GH789IJ", "Fiat", 2020, 450.75);


            System.out.println("\nVehículos creados (impresos con VehiculoPrinter):");
            printer.imprimirInformacion(vehiculo1);
            printer.imprimirInformacion(vehiculo2);
            printer.imprimirInformacion(vehiculo3);



        } catch (IllegalArgumentException e) {
            // Captura errores específicos de validación definidos en Vehiculo
            System.err.println("\nError creando vehículo: " + e.getMessage());
        } catch (Exception e) {
            // Captura cualquier otro error inesperado durante la ejecución
            System.err.println("\nOcurrió un error inesperado: " + e.getMessage());
            e.printStackTrace(); // Imprime el stack trace para más detalles del error
        }

        System.out.println("\n--- Fin Etapa 2 ---");
    }
}