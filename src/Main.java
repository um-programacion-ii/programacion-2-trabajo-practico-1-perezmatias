
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Vehículos - Etapa 4 (LSP) ---");


        VehiculoPrinter printer = new VehiculoPrinter();

        try {

            Vehiculo vehiculoBase = new Vehiculo("VWX789", "Subaru", 2017, 400.0);
            Camion camion1 = new Camion("HIJ456", "Scania", 2020, 12000.0, true);
            Auto auto1 = new Auto("MNO123", "Chevrolet", 2022, 150.0, 5);
            Auto auto2 = new Auto("PQR456", "Nissan", 2023, 125.5, 4);
            Camion camion2 = new Camion("KLM789", "Volvo", 2018, 10500.5, false);

            System.out.println("\nVehículos creados (demostrando LSP):");

            printer.imprimirInformacion(vehiculoBase);
            printer.imprimirInformacion(camion1);
            printer.imprimirInformacion(auto1);
            printer.imprimirInformacion(auto2);
            printer.imprimirInformacion(camion2);


        } catch (IllegalArgumentException e) {

            System.err.println("\nError creando vehículo: " + e.getMessage());
        } catch (Exception e) {

            System.err.println("\nOcurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Fin Etapa 4 ---");
    }
}