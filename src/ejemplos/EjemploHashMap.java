package ejemplos;

import java.util.HashMap;
import java.util.Iterator;

public class EjemploHashMap {
    public static void main(String [] args) {

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(3, "C");
        mapa.put(3, "D");


        System.out.println(mapa.keySet()); //Solo las claves
        System.out.println(mapa.values()); //Solo los valores

        Iterator<Integer> it = mapa.keySet().iterator();

        while (it.hasNext()) {
            int clave = it.next();
            System.out.println(clave + ": " + mapa.get(clave) );
        }


        for (Integer clave : mapa.keySet()){
            System.out.println("Clave: "+ mapa.get(clave) );
        }
    }
}
