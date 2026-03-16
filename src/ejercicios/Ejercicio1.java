package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        int num;
        int suma = 0;
        int tamanio = r.nextInt(20 - 10 + 1) + 10;

        System.out.println("---------CONTENIDO---------");
        for (int i = 0; i < tamanio; i++) {
            lista.add(r.nextInt(101));
            num = lista.get(i);
            System.out.println(num);
            suma += num;
        }

        System.out.println("---------SUMA---------");
        System.out.println(suma);

        /**
         * ---------ELIMINAR Y REEMPLAZAR PARES Y DIVISIBLES POR 3---------
         */
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) % 2 == 0){
                lista.remove(i);
            }
            else if (lista.get(i) % 3 == 0){
                lista.set(i,0);
            }

        }

        /**
         * EXEPCIO IndexOutOfBounds
         */
        for (Integer i : lista) {
            if (i % 5 == 0)
                lista.set(i - 1, 555);
        }


        System.out.println("---------LISTA FINALIZADA---------");
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()){
            int numero;
            numero = iterator.next();
            System.out.println(numero);
        }

    }
}
