package ejercicio9;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Jugador> equipo = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            opcion = menu(sc);

            switch(opcion){
                case 1 -> añadirJugador(equipo,sc);
                case 2 -> listarJugadores(equipo);
                case 3 -> elimniarjugador(equipo,sc);
                case 4 -> reestablecerLista(equipo);
                case 5 ->{
                    String plantilla = listarJugadoresAlturaNombre(equipo);
                    System.out.println(plantilla);
                }
                case 6 -> System.out.println("Saliendo");
            }

        }while(opcion != 6);


    }

    public static void añadirJugador(TreeSet<Jugador> equipos, Scanner sc){
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        sc.next();

        System.out.println("Ingrese la altura del jugador: ");
        float altura = sc.nextFloat();


        if(equipos.add(new Jugador(nombre,altura)) ){
            System.out.println("Jugador agregado");
        }
        else{
            System.out.println("Jugador no agregado");
        }
    }

    public static void  listarJugadores(TreeSet<Jugador> equipos){
        if(!equipos.isEmpty()){
            for (Jugador j : equipos){
                System.out.println(j.toString());
            }
        }
        else
            System.out.println("Lista vacia");
    }


    public static String  listarJugadoresAlturaNombre(TreeSet<Jugador> lista){
        StringBuilder resultado = new StringBuilder();

        if (!lista.isEmpty()){
            TreeSet<Jugador> listaOrdenada = new TreeSet<>(Comparator.comparing(Jugador::getNombre).thenComparing(Jugador::getEstatura));
            listaOrdenada.addAll(lista);

            for (Jugador j : listaOrdenada){
                resultado.append(j.getNombre() ).append(j.getEstatura() );
            }

        }
        return resultado.toString();
    }

    public static void elimniarjugador(TreeSet<Jugador> equipos, Scanner sc){
        boolean resultado;

        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();

        sc.next();

        System.out.println("Ingrese la altura del jugador: ");
        float altura = sc.nextFloat();

        resultado = equipos.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre) && j.getEstatura() == altura);

        if (resultado){
            System.out.println("Jugador eliminado");
        }
        else{
            System.out.println("Jugador no eliminado");
        }
    }





    public static void reestablecerLista(TreeSet<Jugador> equipos){
       if(!equipos.isEmpty()){
           equipos.clear();
       }
    }


    public static int menu(Scanner sc){
        int opcion;

        do{
            System.out.println("=====================");
            System.out.println("       MENU          ");
            System.out.println("=====================");
            System.out.println("1. Añadir Jugador");
            System.out.println("2. Listar Jugadores");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Borrar todos");
            System.out.println("5. Listar por nombre y altura");
            System.out.println("6. Salir");

            System.out.println("Introduce una opcion:");
            opcion = sc.nextInt();


            if (opcion < 1 || opcion > 6){
                System.out.println("Opcion invalida");
            }

        } while(opcion < 1 || opcion > 6);


        return opcion;
    }


}
