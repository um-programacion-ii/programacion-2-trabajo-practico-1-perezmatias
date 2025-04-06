

public class VehiculoPrinter {


    public void imprimirInformacion(Vehiculo vehiculo) {

        if (vehiculo == null) {
            System.out.println("No se puede imprimir información de un vehículo nulo.");
            return;
        }

        System.out.println("--- Vehículo (Impreso por VehiculoPrinter) ---");

        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad Carga (Kg): " + vehiculo.getCapacidadCargaKg());


        if (vehiculo instanceof Camion) {

            Camion camion = (Camion) vehiculo;

            System.out.println("Tiene Acoplado: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }

        System.out.println("--------------------------------------------");
    }
}