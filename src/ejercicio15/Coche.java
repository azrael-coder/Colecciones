package ejercicio15;
import java.util.HashMap;



public class Coche {
    public static void main(String[] args) {
        HashMap<String, String> coches = new HashMap<>();
        coches.put("1234 NBB","SEAT");
        coches.put("9876 MZZ","Mercedez");
        coches.put("533 FRT","Mercedez");
        coches.put("R 1234 BBB","Toyota");
        coches.put("E 1235 BBB","Ford");
        coches.put("R 9876 MZZ","Ford");


        coches.forEach((k, v) -> {
            if (v.equals("Mercedez") ) {
                System.out.println(k + " | " + v);
            }
        });
        /*
        System.out.println();

        ArrayList<String> cochesArray = new ArrayList<>(coches.keySet());
        System.out.println("==========Orden por Matricula==========");
        cochesArray.sort(String::compareTo);
        for (String p : cochesArray) {
            System.out.println("Matricula: " +p + " | "+ " Marca: " + coches.get(p));
        }

        */

    }


}
