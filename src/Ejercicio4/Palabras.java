/**
 * @author Israel Gonzalez Lopez
 */
package Ejercicio4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Palabras {
    private HashSet<String> palabras = new HashSet<>();

    public boolean aniadePalabra(String palabra ) {
        if (palabra != null){
            palabras.add(palabra);
            return true;
        }
        return false;
    }

    public String listaPalabras() {
        String resultado = "";



        Iterator<String> it = palabras.iterator();

            while(it.hasNext()){
                resultado = resultado + it.next() + " | ";
            }
        return resultado;
    }

    public boolean eliminarPalabra(String palabra) {
        boolean resultado;
        String palMinuscula = palabra.toLowerCase();
        resultado = palabras.removeIf(p -> p.equals(palMinuscula));

        return resultado;
    }

    public void borrarTodo(){
        if(!palabras.isEmpty()){
            palabras.clear();
        }
    }

    public int mostrarTamaño(){
        return palabras.size();
    }

    public String buscarPalabra(String palabra){
        String resultado = "";
        String palMinuscula = palabra.toLowerCase();

        Iterator<String> it = palabras.iterator();
        while(it.hasNext()){
            if(it.next().equals(palMinuscula)){
                resultado += it.next();
            }
        }
        return resultado;
    }

    private ArrayList<String> ordenar(HashSet<String> palabras){
        ArrayList<String> resultado = new ArrayList<>();
        Iterator<String> it = palabras.iterator();

        return resultado;
    }

}
