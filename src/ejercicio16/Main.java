package ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int opcion;
        Libros l1 = new Libros(12389,"El Quijote","Cevantes");
        Libros l2 = new Libros(98721,"Juego de Tronos","George Martin");
        Libros l3 = new Libros(57965,"Choque de Reyes","George Martin");
        Libros l4 = new Libros(42845,"Las dos Torres","Tolkien");

        FichaLibros f = new FichaLibros();

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("=======MENU=======");
            System.out.println("1. Añadir libros");
            System.out.println("2. Ver pila de libros");
            System.out.println("3. Fichar Libros");
            System.out.println("4. Salir");

            System.out.println("Introduzca una opcion: ");
            opcion = input.nextInt();

            switch(opcion){
                case 1:{
                    f.añadirLibro(l1);
                    f.añadirLibro(l2);
                    f.añadirLibro(l3);
                    f.añadirLibro(l4);
                    break;
                }
                case 2:{
                    String libros = f.viualizarPila();
                    System.out.println(libros);
                    break;
                }
                case 3:{
                    f.fichar();
                    break;
                }
                case 4:{
                    System.out.println("Saliendo....");
                    break;
                }
                default:{
                    System.out.println("Opcion invalida");
                }
            }
        }while(opcion!=4);

    }
}
