package ejemplosBasicos;

import java.util.ArrayList;

public class Ejercicio2 {
    public static ArrayList<Integer> quitarRepetidos(ArrayList<Integer> lista){
        if (lista != null) {
            boolean bandera = false;
            for (int i = 0; i < lista.size(); i++){
                for (int j = 0; j < i && !bandera; j++){
                    if (lista.get(i).equals(lista.get(j))){ //EXEPCION IOBounds
                        lista.remove(i);
                        i --;
                        bandera = true;
                    }
                }
            }
        }
        return lista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista;
        lista = Ejercicio1.generarEnteros(1,30,20);

        ArrayList<Integer> nuevaLista = quitarRepetidos(lista);

        System.out.println();
        int contador = 1;
        for (Integer i : nuevaLista){
            System.out.println("Num:" + contador + " " + i);
            contador++;
        }

    }
}
