/**
 * @author Israel Gonzalez Lopez
 */
package Ejercicio4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Palabras {
    private HashSet<String> palabras = new HashSet<>();

    public  void aniadePalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String pal = sc.nextLine();

        palabras.add(pal.toLowerCase());
        System.out.println("Palabra añadida");


    }

    public String listaPalabras() {
        String resultado = "";

        ArrayList<String> ordenado = new ArrayList<>();
        ordenado.addAll(palabras);
        Collections.sort(ordenado);

        for (String p : ordenado) {
            resultado += p + " | ";
        }
        return resultado;
    }

    public boolean eliminarPalabra(String pal) {
        boolean resultado;
        String palMinuscula = pal.toLowerCase();
        resultado = palabras.removeIf(p -> p.equals(palMinuscula));

        return resultado;
    }

    public void borrarTodo(){
        palabras.clear();

    }

    public int mostrarTamaño(){
        return palabras.size();
    }

    public boolean buscarPalabra(String pal){
        String palMinuscula = pal.toLowerCase();
        return palabras.contains(palMinuscula);
    }
}
