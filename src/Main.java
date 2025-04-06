
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Vehículos - Etapa 3 (OCP) ---");


        VehiculoPrinter printer = new VehiculoPrinter();

        try {

            Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Ford", 2019, 600.5);
            Camion camion1 = new Camion("HIJ456", "Scania", 2020, 12000.0, true);
            Camion camion2 = new Camion("KLM789", "Volvo", 2018, 10500.5, false);
            Vehiculo vehiculo2 = new Vehiculo("AE456FG", "Toyota", 2021, 750.0);

            System.out.println("\nVehículos creados:");

            printer.imprimirInformacion(vehiculo1); // Imprime info base
            printer.imprimirInformacion(camion1);   // Imprime info base + acoplado
            printer.imprimirInformacion(camion2);   // Imprime info base + acoplado
            printer.imprimirInformacion(vehiculo2); // Imprime info base

        } catch (IllegalArgumentException e) {
            System.err.println("\nError creando vehículo: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nOcurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Fin Etapa 3 ---");
    }
}