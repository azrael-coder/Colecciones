package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Palabras pal = new Palabras();

        pal.aniadePalabra("objeto");
        pal.aniadePalabra("casa");
        pal.aniadePalabra("coche");


        boolean quitar = pal.eliminarPalabra("sggg");
        String contenido = pal.listaPalabras();
        String busca = pal.buscarPalabra("objeto");


        System.out.println(contenido);
        System.out.println(quitar);
        System.out.println(busca);



    }
}
