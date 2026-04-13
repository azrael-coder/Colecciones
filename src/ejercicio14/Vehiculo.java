package ejercicio14;

import java.time.LocalDateTime;

public class Vehiculo implements Comparable<Vehiculo> {
    private String modelo;
    private String matricula;
    private LocalDateTime fecha;


    public Vehiculo(String modelo, String matricula, LocalDateTime fecha) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.fecha = fecha;
    }


    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Compara dos vehículos por su matrícula (ignorando mayúsculas/minúsculas).
     * Se utiliza para ordenar listas de vehículos.
     * @param otra el vehículo con el que se compara
     * @return negativo si esta matrícula es menor, 0 si son iguales, positivo si es mayor
     */
    @Override
    public int compareTo(Vehiculo otra) {
        if (otra != null) {
            return this.matricula.compareToIgnoreCase(otra.getMatricula());
        }
        else return 0;
    }
}
