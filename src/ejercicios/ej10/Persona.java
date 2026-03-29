package ejercicios.ej10;

public class Persona {
    private String nombre;
    private String dni;


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        if (dni.length() == 9)
            this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}
