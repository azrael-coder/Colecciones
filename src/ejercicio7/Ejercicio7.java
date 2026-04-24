package ejercicio7;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("mesa", "table");
        diccionario.put("rojo", "red");
        diccionario.put("el", "he");
        diccionario.put("aleatorio", "random");
        diccionario.put("azul", "blue");
        diccionario.put("ordenador", "computer");
        diccionario.put("movil", "smartphone");
        diccionario.put("ventana", "window");
        diccionario.put("caminando", "walking");
        diccionario.put("conducir", "drive");

        ArrayList<String> lista = new ArrayList<>(diccionario.keySet());
        int contador = 0;
        int correctas = 0;
        int incorrectos = 0;

        Collections.shuffle(lista);
        Scanner leer = new Scanner(System.in);
        do{

            String palabra = lista.get(contador);
            System.out.print("Ingrese la traduccion en ingles de: " + palabra + ": ");
            String traduccion = leer.nextLine().toLowerCase().trim();

            String respuestaCorrecta = diccionario.get(palabra); // Pasandole la clave introducida por el usuario busca la palabra traduccion correcta

            if (traduccion.equals(respuestaCorrecta)) {
                System.out.println("Correcta!!");
                correctas++;
            }
            else {
                System.out.println("Incorrecta");
                incorrectos++;
            }
            contador++;

        }while(contador < 5);

        System.out.println("=====Resultados======");
        System.out.println("Correctos: " + correctas + " incorrectos: " + incorrectos);

        System.out.println("=====Ordenadas=====");
        lista.sort((a,b)-> b.length() - a.length());
        for (String p : lista) {
            System.out.println(p + " | " + diccionario.get(p) );
        }




    }
}
