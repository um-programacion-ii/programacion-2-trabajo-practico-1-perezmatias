import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static List<Vehiculo> flota = new ArrayList<>();
    private static VehiculoPrinter printer = new VehiculoPrinter();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión de Vehículos - Etapa 5 (ArrayList - Búsqueda Interactiva) ---");

        try {
            poblarFlotaInicial();

            System.out.println("\n--- Imprimiendo Flota Completa ---");
            imprimirFlota();

            System.out.println("\n--- Búsqueda Interactiva por Patente ---");
            while (true) {

                System.out.print("Ingrese la patente a buscar (o escriba 'salir' para terminar): ");
                String patenteIngresada = scanner.nextLine();

                if (patenteIngresada == null || "salir".equalsIgnoreCase(patenteIngresada.trim())) {
                    break;
                }

                buscarEImprimir(patenteIngresada);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("\nError durante la inicialización: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nOcurrió un error inesperado en la ejecución: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                System.out.println("\nCerrando Scanner...");
                scanner.close();
            }
        }

        System.out.println("\n--- Fin Etapa 5 ---");
    }

    private static void poblarFlotaInicial() {
        System.out.println("Poblando flota inicial...");
        flota.add(new Vehiculo("VWX789", "Subaru", 2017, 400.0));
        flota.add(new Camion("HIJ456", "Scania", 2020, 12000.0, true));
        flota.add(new Auto("MNO123", "Chevrolet", 2022, 150.0, 5));
        flota.add(new Auto("PQR456", "Nissan", 2023, 125.5, 4));
        flota.add(new Camion("KLM789", "Volvo", 2018, 10500.5, false));
        flota.add(new Vehiculo("STU111", "Fiat", 2019, 550.0));
        System.out.println("Flota poblada.");
    }

    private static void imprimirFlota() {
        if (flota.isEmpty()) {
            System.out.println("La flota está vacía.");
            return;
        }
        for (Vehiculo v : flota) {
            printer.imprimirInformacion(v);
        }
    }

    private static Optional<Vehiculo> buscarVehiculoPorPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            return Optional.empty();
        }
        String patenteLimpia = patente.trim().toUpperCase();
        for (Vehiculo v : flota) {
            if (v.getPatente().equals(patenteLimpia)) {
                return Optional.of(v);
            }
        }
        return Optional.empty();
    }

    private static void buscarEImprimir(String patente) {
        System.out.println("\nBuscando patente: '" + patente + "'...");
        Optional<Vehiculo> resultado = buscarVehiculoPorPatente(patente);
        if (resultado.isPresent()) {
            System.out.println("Vehículo encontrado:");
            printer.imprimirInformacion(resultado.get());
        } else {
            if (patente != null && !patente.trim().isEmpty()){
                System.out.println("Vehículo con patente '" + patente + "' no encontrado en la flota.");
            } else {
                System.out.println("Patente de búsqueda inválida proporcionada.");
            }
        }
    }
}