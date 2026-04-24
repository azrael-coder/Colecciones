package ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();

        usuarios.put("admin", "12345@Admin");
        usuarios.put("user1", "45671@User1");
        usuarios.put("user2", "93578@User2");
        usuarios.put("userModerador", "10987@Moderator");

        int intentos = 3;
        String usuario;
        String contra;
        Scanner leer = new Scanner(System.in);
        boolean entrado = false;


        do {
            System.out.println("Introduce el usuario: ");
            usuario = leer.nextLine();


            System.out.println("Introduce la contraseña: ");
            contra = leer.nextLine();

            if (usuarios.containsKey(usuario) && contra.equals(usuarios.get(usuario))) {
                System.out.println("Te has logueado");
                entrado = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos");
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }

        }while(intentos > 0 && !entrado);

        TreeMap<String,String> map = new TreeMap<>(usuarios);

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();

            System.out.println(key + ": " + map.get(key));
        }
    }

}
