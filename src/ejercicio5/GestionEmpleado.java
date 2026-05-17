package ejercicio5;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que utilizando una colección HashSet permita, a través de
 * un menú, gestionar una lista de empleados de número ilimitado donde no se
 * permitirán dnis de empleados repetidos y siendo el orden de los mismos
 * totalmente irrelevante:
 */
public class GestionEmpleado {
    HashSet<Empleado> empleados = new HashSet<>();

    public boolean añadirEmpleado() {
        Scanner sc = new Scanner(System.in);
        String dni = "";
        String nombre = "";
        double sueldo = 0;
        try {
            System.out.println("Ingrese el dni: ");
             dni = sc.nextLine();
             dni = dni.toLowerCase();


            System.out.print("Ingrese el nombre del empleado: ");
             nombre = sc.nextLine();

            System.out.print("Ingrese el sueldo: ");
             sueldo = sc.nextDouble();

        }catch(InputMismatchException e){
            System.out.println("Datos incorrectos");
        }

        return empleados.add(new Empleado(dni, nombre, sueldo) );
    }



    public String listarEmpleados() {
        StringBuilder resultado = new StringBuilder();

        if (!empleados.isEmpty() ) {
            for (Empleado e : empleados){
                resultado.append(e.getNombre()).append(" | ").append(e.getSalario()).append("\n");
            }
        }

        return resultado.toString();
    }


    public boolean eliminarEmpleado(String dni) {
        return empleados.removeIf(e -> e.getDni().equalsIgnoreCase(dni) );
    }

    public boolean limpiarlistado() {
        boolean reseteada;
        if (empleados.isEmpty()) {
            reseteada = false;
        }
        else {
            empleados.clear();
            reseteada = true;
        }
            return reseteada;
    }

    public String buscarEmpleado(String dni, Empleado e) {
        StringBuilder resultado = new StringBuilder();

            for (Empleado emp : empleados) {
                if (emp.getDni().equalsIgnoreCase(dni))
                    resultado.append(emp);
            }

        return resultado.toString();
    }


    public int numEmpleados() {
        return empleados.size();
    }
}
