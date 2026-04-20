/**
 * @author Israel Gonzalez Lopez
 * @version 1.0
 */
package Ejercicio4;
import java.util.ArrayList;
import java.util.HashSet;

public class Palabras {
    private HashSet<String> palabras = new HashSet<>();

    public boolean aniadePalabra(String pal) {
        boolean resultado = false;
        if (pal != null) {
            resultado =palabras.add(pal);
        }
        return resultado;
    }

    public String listaPalabras() {
        String resultado = "";

        ArrayList<String> ordenado = new ArrayList<>();
        ordenado.addAll(palabras);


        //Ordenar por tamaño y a igual tamaño alfabeticamente
        ordenado.sort( (o1,o2) -> {
            int orden;

            if (o1.length() != o2.length()) {
                orden = o1.length() - o2.length();
            }
            else
                orden = o1.compareToIgnoreCase(o2);

            return orden;
        });


        for (String p : ordenado) {
            resultado += p + "\n";
        }
        return resultado;
    }

    public boolean eliminarPalabra(String pal) {
        boolean resultado;

        if ( pal == null ) {
            resultado = false;
        }
        else{
            String palMinuscula = pal.toLowerCase();
            resultado = palabras.removeIf(n -> n.equals(palMinuscula));
        }
        return resultado;
    }

    public boolean buscarPalabra(String pal){
        String palMinuscula = pal.toLowerCase();
        return palabras.contains(palMinuscula);
    }

    public void reestablecer(){
        palabras.clear();

    }

    public int mostrarTamaño(){
        return palabras.size();
    }


}
