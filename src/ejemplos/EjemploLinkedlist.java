package ejemplos;

import java.util.LinkedList;

public class EjemploLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        lista.addFirst(5);
        lista.addLast(10);

        lista.iterator().forEachRemaining(System.out::println);


        LinkedList<String> pila = new LinkedList<>();
        pila.push("Cuarto");
        pila.push("Tercero");
        pila.push("Segundo");
        pila.push("Primero");

        while(!pila.isEmpty() ){
            System.out.println(pila.pop() );
        }
        System.out.println("---------------------------");


        System.out.println(pila.peek());


        System.out.println("---------------------------");
        LinkedList<String> cola = new LinkedList<>();

    }
}
