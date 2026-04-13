package ejercicio14;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Primero","3564-IGL", LocalDateTime.of(2020,1,1,1,1));
        Vehiculo v2 = new Vehiculo("Segundo","1412-ABC", LocalDateTime.of(2025,3,5,8,45));
        Vehiculo v3 = new Vehiculo("Tercero","9837-XYZ", LocalDateTime.now());
        GestionReparaciones g = new GestionReparaciones();


        int opcion = 0;
        while(opcion != 7){
            Scanner input = new Scanner(System.in);
            System.out.println("-----MENU-----");
            System.out.println("1. Añadir Vehiculo");
            System.out.println("2. Reparar siguiente vehiculo");
            System.out.println("3. Cola espera");
            System.out.println("4. Cola reparando");
            System.out.println("5. Ver Vehiculos ordenados");
            System.out.println("6. Ver Vehiculos ordenados por fecha de entrada");
            System.out.println("7. Salir");
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
                    g.listarOrdenadasMatricula();
                    break;
                }
                case 6: {
                    g.listarOrdenadasFechaEntrada();
                }
                case 7:{
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
