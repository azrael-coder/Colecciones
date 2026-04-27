package ejercicio8;

import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio8 {
    public static void main(String[] args) {
        TreeSet<Integer> arbol = agregarNums();


        for (Integer n : arbol){
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.println("============================");
        System.out.println("Lista ordenada descendente: ");
        System.out.println("============================");

        System.out.println();

        TreeSet<Integer> invertida = (TreeSet<Integer>) arbol.reversed();
        for (Integer n : invertida){
            System.out.print(n + " ");
        }


    }

    public static TreeSet<Integer> agregarNums(){
        TreeSet<Integer> arbol = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        String numeros = sc.nextLine();

        sc.close();

        String []nums = numeros.split(" ");

        for (int i = 0; i < nums.length; i++) {
            if (!arbol.add(Integer.parseInt(nums[i]) ) ){
                System.out.println("El numero "+ nums[i] +" esta repetido");
            }
        }

        return arbol;
    }
}
