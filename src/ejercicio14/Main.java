package ejercicio14;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FichaVehiculo v1 = new FichaVehiculo("primero","13459IJL", LocalDateTime.now());
        FichaVehiculo v2 = new FichaVehiculo("Segundo","24912ABC", LocalDateTime.now());
        FichaVehiculo v3 = new FichaVehiculo("Tercero","35912ABC", LocalDateTime.now());
        GestionReparaciones g = new GestionReparaciones();


        int opcion = 0;
        while(opcion != 5){
            Scanner input = new Scanner(System.in);
            System.out.println("-----MENU-----");
            System.out.println("1. Añadir Vehiculo");
            System.out.println("2. Reparar siguiente vehiculo");
            System.out.println("3. Cola espera");
            System.out.println("4. Cola reparando");
            System.out.println("5. Salir");
            opcion = input.nextInt();

            switch(opcion){
                case 1: {
                    g.añadeVehiculo(v1);
                    g.añadeVehiculo(v2);
                    g.añadeVehiculo(v3);
                    break;
                }
                case 2: {
                    g.reparar();
                    break;
                }
                case 3:{
                    String resultado = g.verEspera();
                    System.out.println(resultado);
                    break;
                }
                case 4:{
                    String resultado = g.verReparando();
                    System.out.println(resultado);
                    break;
                }
                case 5: {
                    System.out.println("Saliendo");
                    break;
                }
                default:{
                    System.out.println("Opcion invalida");
                }

            }
        }
    }
}
