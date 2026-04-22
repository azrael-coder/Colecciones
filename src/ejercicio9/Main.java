package ejercicio9;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Jugador> equipos = new TreeSet<>();

        Jugador j1 = new Jugador("Messi", 1.70f);
        Jugador j2 = new Jugador("Ronaldo", 1.83f);
        Jugador j3 = new Jugador("Yamal", 1.84f);
        Jugador j4 = new Jugador("Fermin", 1.76f);
    }

    public static void añadirJugador(TreeSet<Jugador> equipos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la altura del jugador: ");
        float altura = sc.nextFloat();

        equipos.add(new Jugador(nombre,altura));
    }

    public static String  listarJugadores(TreeSet<Jugador> equipos){
        StringBuilder resultado = new StringBuilder();

        for (Jugador j : equipos){
            resultado.append( j.getNombre() ).append(j.getEstatura() );
        }

        return resultado.toString();
    }

    public boolean elimniarjugador(TreeSet<Jugador> equipos){
        Scanner sc = new Scanner(System.in);
        boolean resultado = false;

        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la altura del jugador: ");
        float altura = sc.nextFloat();

        resultado = equipos.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre) && j.getEstatura() == altura);

        return resultado;
    }





    public void reestablecerLista(TreeSet<Jugador> equipos){
        equipos.removeAll(equipos);
    }


}
