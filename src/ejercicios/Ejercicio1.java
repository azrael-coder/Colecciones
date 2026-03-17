package ejercicios;
/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego realice las siguientes operaciones: mostrar el contenido,
 * calcular la suma, borrar aquellos números que serán pares y volver a mostrar el
 * contenido, remplazar los números divisibles por 3 con el valor 0 y volver a
 * mostrar el contenido, por último, si aparece un valor divisible entre cinco,
 * insertar en la posición anterior el valor 555 y volver a mostrar el contenido. El
 * tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos
 * ambos inclusive
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio1 {
    public static ArrayList<Integer> eliminarPares(ArrayList<Integer> pares){
        /**
         * Cuando haces pares.remove(i), el ArrayList reordena todos los elementos desplazándolos una posición hacia la izquierda
         * El problema es que i sigue avanzando , saltándose el elemento que quedó en esa misma posición.
         */
        for (int i = pares.size(); i <= 0; i--) { //RECORRER HACIA ATRAS PQ remove() reorganiza hacia la izquierda
            if (pares.get(i) % 2 == 0){
                pares.remove(i);
            }
        }
        return  pares;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int num;
        int suma = 0;
        int tamanio = r.nextInt(20 - 10 + 1) + 10;
        ArrayList<Integer> lista = new ArrayList<>(tamanio);

        System.out.println("---------LISTA ANTES---------");
        int contador = 1;
        for (int i = 0; i < tamanio; i++) { //LLENAR ArrayList

            lista.add(r.nextInt(101));
            num = lista.get(i);
            System.out.println("Numero " + contador +  ":" + num);
            suma += num;

            contador++;
        }

        System.out.println();
        System.out.println("---------SUMA---------");
        System.out.println(suma);

        lista = eliminarPares(lista); //ELIMINAR PARES (en progreso)

         //---------REEMPLAZAR  DIVISIBLES POR 3---------

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 3 == 0){
                lista.set(i,0);
            }
        }

        System.out.println("---------PRUEBA---------");
        for (Integer i : lista) {
            System.out.print(i + " - ");
        }

        for (int i = 0; i<lista.size();i++) {
            if (lista.get(i) % 5 == 0)
                lista.set(i - 1, 555);
        }

        System.out.println();

        System.out.println("---------LISTA DESPUES---------");
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            int numero;
            numero = iterator.next();
            System.out.print(numero+ "-");
        }

    }
}
