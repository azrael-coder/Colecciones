package ejemplos;
import java.util.HashSet;
import java.util.Iterator;

public class EjHashSet {
    public static void main(String[] args) {
        Persona p1 = new Persona("sf",44);
        Persona p2 = new Persona("tuti",25);
        Persona p3 = new Persona("lisa",23);
        Persona p4 = new Persona("lisa",23);

        HashSet<Persona> personas = new HashSet<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        //personas.forEach(System.out::println);

        Iterator<Persona> it = personas.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
