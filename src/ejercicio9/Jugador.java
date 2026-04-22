package ejercicio9;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private float estatura;

    public Jugador(String nombre, float estatura) {
        this.nombre = nombre;
        if (estatura > 0) {
            this.estatura = estatura;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
        if ( (o instanceof Jugador j) ) {

            if (j.estatura == this.estatura && j.nombre.equalsIgnoreCase(nombre) ) {
                resultado = true;
            }
        }
        return resultado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEstatura());
    }

    @Override
    public int compareTo(Jugador o) {
        int resultado;

        if (o != null) {
            resultado = nombre.compareTo(o.getNombre());
        }
        else
            resultado = 1;

        return resultado;
    }
}
