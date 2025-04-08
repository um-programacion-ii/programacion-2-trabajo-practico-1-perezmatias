
public class Camion extends Vehiculo {

    private boolean tieneAcoplado;


    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {

        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    // --- Getter específico de Camion ---
    public boolean isTieneAcoplado() {
        // Por convención, para booleanos se usa 'is' en lugar de 'get'
        return tieneAcoplado;
    }

    // --- Setter específico de Camion ---
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }


    @Override
    public String toString() {
        // Podemos reutilizar el toString de Vehiculo o construir uno nuevo.
        // Construyamos uno nuevo para mostrar cómo acceder a los getters.
        return "Camion{" +
                "patente='" + getPatente() + '\'' + // Usamos getters heredados
                ", marca='" + getMarca() + '\'' +
                ", anio=" + getAnio() +
                ", capacidadCargaKg=" + getCapacidadCargaKg() +
                ", tieneAcoplado=" + tieneAcoplado + // Atributo propio
                '}';
    }
}