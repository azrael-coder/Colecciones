/**
 * @author Israel Gonzalez Lopez
 */
package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palabras pal = new Palabras();


        int opcion = 0;
        do {
            System.out.println("====================");
            System.out.println("    * MENU *    ");
            System.out.println("=====================");
            System.out.println();
            System.out.println("\u001B[32m1. Añadir Palabra\u001B[32m");
            System.out.println("\u001B[32m2. Ver Lista\u001B[32m");
            System.out.println("\u001B[32m3. Eliminar Palabra\u001B[32m");
            System.out.println("\u001B[32m4. Buscar Palabra\u001B[32m");
            System.out.println("\u001B[32m5. Tamaño lista\u001B[32m");
            System.out.println("\u001B[32m6. Borrar lista\u001B[32m");
            System.out.println("\u001B[32m7. Salir\u001B[32m");
            System.out.println();
            System.out.println("=====================");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcion incorrecta"); //en el catch para vaciar el buffer
                sc.nextLine();
            }
            sc.nextLine();
            switch (opcion) {
                case 1: {
                    pal.aniadePalabra();
                    break;
                }
                case 2: {
                    String pl = pal.listaPalabras();
                    System.out.println(pl);
                    break;
                }
                case 3: {
                    System.out.println("Palabra a borrar: ");
                    String p = sc.nextLine();
                    String mensaje = pal.eliminarPalabra(p) ? "Palabra eliminada" : "No encontrada";
                    System.out.println(mensaje);
                    break;
                }
                case 4: {
                    System.out.println("Palabra a buscar: ");
                    String p = sc.nextLine();
                    String mensaje = pal.buscarPalabra(p) ? "esta" : "No encontrada";
                    System.out.println(mensaje);
                    break;
                }
                case 5: {
                    System.out.println((pal.mostrarTamaño()));
                    break;
                }
                case 6: {
                    pal.borrarTodo();
                    break;
                }
                case 7: {
                    System.out.println("Saliendo");
                    break;
                }
                default: {
                }
            }

        }while(opcion != 7 );


    }
}
