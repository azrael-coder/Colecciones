package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();

        l1.add("Azrael");
        l1.add(1,20);
        l1.add(2,new Persona("nombre", 23) );
        Object o;

        //FORMA 1 para recorrer
        for (int i = 0; i < l1.size(); i++) {
            o = l1.get(i);
        }

        //FORMA 2 con Iterator
        Iterator iterator = l1.iterator();

        while (iterator.hasNext() ) {
            int numero;
            o = iterator.next();
            System.out.println(o);
        }
    }
}
