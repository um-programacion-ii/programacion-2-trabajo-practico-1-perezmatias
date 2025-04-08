
public class Auto extends Vehiculo { // Hereda de Vehiculo

    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {

        super(patente, marca, anio, capacidadCargaKg);


        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser positiva.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // --- Getter específico de Auto ---
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    // --- Setter específico de Auto (con validación) ---
    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser positiva.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + getPatente() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", anio=" + getAnio() +
                ", capacidadCargaKg=" + getCapacidadCargaKg() +
                ", cantidadPasajeros=" + cantidadPasajeros + // Atributo propio
                '}';
    }
}