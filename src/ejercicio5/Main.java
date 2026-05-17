package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmpleado g1 = new GestionEmpleado();

        int opcion = 0;
        do{
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Ingrese una opcion: ");
                opcion = sc.nextInt();

                g1.añadirEmpleado();

                String empleados = g1.listarEmpleados();

                System.out.println(empleados);

                g1.eliminarEmpleado("08015804m");

                System.out.println(g1.listarEmpleados() );
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() );
            }

        } while (opcion != 7);

    }
}
