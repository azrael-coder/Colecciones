/**
 * @author Israel Gonzalez Lopez
 */
package Ejercicio4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Palabras {
    private HashSet<String> palabras = new HashSet<>();

    public boolean aniadePalabra(String pal) {
        if (pal != null) {
            palabras.add(pal);
            return true;
        }
        return false;
    }

    public String listaPalabras() {
        String resultado = "";

        ArrayList<String> ordenado = new ArrayList<>();
        ordenado.addAll(palabras);
        Collections.sort(ordenado);

        for (String p : ordenado) {
            resultado += p + "\n";
        }
        return resultado;
    }

    public boolean eliminarPalabra(String pal) {
        boolean resultado;
        if (pal == null) {
            resultado = false;
        }
        else{
            String palMinuscula = pal.toLowerCase();
            palabras.removeIf(palMinuscula::contains);
            resultado = true;
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
