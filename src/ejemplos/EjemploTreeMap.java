package ejemplos;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> lista = new TreeMap<Integer,String>();

        lista.put(1, "1");
        lista.put(2, "2");
        lista.put(3, "4");
        lista.put(4, "8");
        lista.put(5, "16");
        lista.put(6, "32");
        lista.put(6, "64");


        System.out.println("=====Tree Map======");
        for (Integer k : lista.keySet()) {
            System.out.println(k + ": " + lista.get(k));
        }
    }
}
