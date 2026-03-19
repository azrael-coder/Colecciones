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
import java.util.Random;

public class Ejercicio1 {
    public static ArrayList<Integer> eliminarPares(ArrayList<Integer> pares){
        /**
         * Cuando haces pares.remove(i), el ArrayList reordena todos los elementos desplazándolos una posición hacia la izquierda
         * El problema es que i sigue avanzando , saltándose el elemento que quedó en esa misma posición.
         */
        for (int i = pares.size()-1; i >= 0; i--) { //RECORRER HACIA ATRAS PQ remove() reorganiza hacia la izquierda
            if (pares.get(i) % 2 == 0){
                pares.remove(i);
            }
        }
        return  pares;
    }

    public static ArrayList<Integer> generarEnteros(int min, int max, int tamanio){
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) { //LLENAR ArrayList
            lista.add(r.nextInt(max-min+1)+min);
        }
        return lista;
    }

    public static String mostrarListaySuma( ArrayList<Integer> lista){
        String resultado = "";
        int suma = 0;
        for (Integer i : lista){
            resultado += i + " ";
            suma += i;
        }

        return resultado + "Suma: " + suma;
    }

    //---------REEMPLAZAR  DIVISIBLES POR 3---------
    public static ArrayList<Integer> quitar3(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 3 == 0){
                lista.set(i,0);
            }
        }
        return lista;
    }

    //---------REEMPLAZAR  DIVISIBLES POR 5
    public static ArrayList<Integer> quitar5(ArrayList<Integer> lista){
        for (int i = 0; i<lista.size();i++) {
            if (lista.get(i) % 5 == 0)
                lista.add(i, 555);
            i++;
        }

        return lista;
    }



    public static void main(String[] args) {
        ArrayList<Integer> lista = generarEnteros(1,30,20);
        lista = quitar3(lista);
        lista = eliminarPares(lista);
        lista = quitar5(lista);

        String list = mostrarListaySuma(lista);

        System.out.println(list);

    }
}
