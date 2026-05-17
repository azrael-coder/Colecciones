package ejercicio5;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String dni;
    private double salario;


    public Empleado(String dni,String nombre, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        if (salario > 0) {
            this.salario = salario;
        }
    }



    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Empleado empleado) ) return false;
        return empleado.dni.equals(this.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
