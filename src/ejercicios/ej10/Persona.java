/**
 * @autor Israel
 * @version 1.2
 */
package ejercicios.ej10;
import java.time.LocalDate;
public class Persona {
    private String nombre;
    private String dni;
    private LocalDate fenacimiento;


    public Persona(String nombre, String dni, LocalDate fenacimiento) {
        this.nombre = nombre;
        if (dni.length() == 9)  {this.dni = dni;}
        this.fenacimiento = fenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFenacimiento() {
        return fenacimiento;
    }

}
