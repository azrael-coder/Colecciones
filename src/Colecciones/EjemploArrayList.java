package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("fifjf",12));
        Persona a;

        System.out.println("-----------USANDO FOR-EACH----------");
        int poss = 1;
        for (Persona p : lista){
            a = p;
            System.out.println(poss + ":" + a);
            poss++;
        }


        for (int i  = 0; i< lista.size(); i++){
            a = lista.get(i);
        }
        System.out.println("-----------USANDO Iterator----------");
        Iterator<Persona> it = lista.iterator();
        while (it.hasNext()){
            a = it.next();
            System.out.println(a.getNombre() + " EDAD: " + a.getEdad());
        }
    }
}
