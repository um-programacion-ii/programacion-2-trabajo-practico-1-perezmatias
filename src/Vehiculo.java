import java.time.Year;

public class Vehiculo {

    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    private static final int ANIO_MINIMO = 1900;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {

        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni estar vacía.");
        }

        int anioActual = Year.now().getValue();
        if (anio <= ANIO_MINIMO || anio > anioActual) {
            throw new IllegalArgumentException("Año inválido. Debe ser mayor que " + ANIO_MINIMO + " y no mayor que " + anioActual + ".");
        }

        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }

        this.patente = patente.trim().toUpperCase();
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // --- Getters ---
    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public int getAnio() { return anio; }
    public double getCapacidadCargaKg() { return capacidadCargaKg; }

    // --- Setters ---
    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni estar vacía.");
        }
        this.patente = patente.trim().toUpperCase();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        int anioActual = Year.now().getValue();
        if (anio <= ANIO_MINIMO || anio > anioActual) {
            throw new IllegalArgumentException("Año inválido. Debe ser mayor que " + ANIO_MINIMO + " y no mayor que " + anioActual + ".");
        }
        this.anio = anio;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }


    public void mostrarInformacion() {
        System.out.println("--- Vehículo ---");
        System.out.println("Patente: " + this.patente);
        System.out.println("Marca: " + this.marca);
        System.out.println("Año: " + this.anio);
        System.out.println("Capacidad Carga (Kg): " + this.capacidadCargaKg);
        System.out.println("----------------");
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", capacidadCargaKg=" + capacidadCargaKg +
                '}';
    }
}