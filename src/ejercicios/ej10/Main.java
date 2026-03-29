package ejercicios.ej10;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Andres","12345678K");
        Persona p2 = new Persona("Maria","87654321M");
        Persona p3 = new Persona("Carlos","84854321M");
        Persona p4 = new Persona("Daniel");



        Agenda agen = new Agenda();

        agen.aniadePersona(p1);
        agen.aniadePersona(p2);
        agen.aniadePersona(p3);
        agen.aniadePersona(p4);

        agen.borrarPersona("87654321M");

        String buscar = agen.buscarPersona("12345678K");
        System.out.println(buscar);

        System.out.println("------------------------");

        String personas = agen.muestraListaPersona();
        System.out.println(personas);
    }



}
