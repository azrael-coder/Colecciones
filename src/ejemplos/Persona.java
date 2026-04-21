package ejemplos;

import java.util.Comparator;
import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        boolean resultado;
        if (!(o instanceof Persona persona))
            resultado = false;
        else
            resultado = nombre.equalsIgnoreCase(persona.getNombre() ) && edad == persona.getEdad() ;

        return resultado;
    }

    @Override
    public int hashCode() {
        //return Objects.hashCode(getNombre().toLowerCase()  );
        return Objects.hash(nombre.toLowerCase(), edad);
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = 0   ;

            if (this.edad == o.edad)
                return resultado;
            else
                resultado = this.edad - o.edad;

        return resultado;
    }
}
