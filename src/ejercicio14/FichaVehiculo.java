package ejercicio14;

import java.time.LocalDateTime;

public class FichaVehiculo {
    private String modelo;
    private String matricula;
    private LocalDateTime fecha;


    public FichaVehiculo(String modelo, String matricula, LocalDateTime fecha) {
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
}
