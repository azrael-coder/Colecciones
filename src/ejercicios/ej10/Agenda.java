/**
 * @autor Israel
 * @version 1.2
 */
package ejercicios.ej10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Agenda {
    ArrayList<Persona> personas = new ArrayList<>();

    /**
     * Metodo para validar la existencia del dni
     * @param dni dni
     * @return true o false
     */
    private boolean validarDni(String dni) {
        boolean valido = true;
        if (dni != null) {
            for (Persona p : personas){
                if (p.getDni().equals(dni)) {
                    valido = false;
                }
            }
        }
        return valido;
    }

    public boolean aniadePersona(Persona persona){
        if (persona.getDni() == null)
            return false;

        if (validarDni(persona.getDni()) || persona.getNombre() != null ){
            personas.add(persona);
            return true;
        }

        return false;
    }



    public boolean borrarPersona(String dni) {
        if (!validarDni(dni)) {
            return personas.removeIf(p -> p.getDni().equals(dni) );
        }
        return false;
    }


    public String buscarPersona(String dni) {
        String resultado = null;
        if (!validarDni(dni) && dni != null ){
            for (Persona p : personas){
                if (p.getDni().equals(dni) ){
                    resultado = p.getNombre();
                }
            }
        }
        return resultado;
    }

    public String muestraListaPersona() {
        String resultado = "";
            Comparator<Persona> orden =( (p1,p2) -> {
                int comparacion = p1.getNombre().compareTo(p2.getNombre());
                if (comparacion == 0){
                    return p1.getFenacimiento().compareTo(p2.getFenacimiento());
                }
                return comparacion;
            });

        //Ordenar ArrayList por los nombres y por fecha de nacimiento
        personas.sort(orden);

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            resultado += " Nombre: " + p.getNombre() + " DNI: " + p.getDni() + "  |  " + p.getFenacimiento() + "\n";

        }
        return resultado;
    }

    public String muestraListaPersonaDNI(){
        StringBuilder sb = new StringBuilder();
        personas.sort(Comparator.comparing(Persona::getDni));

        for (Persona p : personas){
            sb.append("Nombre: ").append(p.getNombre()).append("   |  DNI: ").append(p.getDni()).append("   |   ").append(p.getFenacimiento()).append("\n");
        }
        return sb.toString();
    }




    /**
     * 11. Modifica el ejercicio anterior con los siguientes requisitos
     * 1. Añade a las personas un nuevo atributo que será su fecha de nacimiento
     * 2. La lista se debe mantener siempre ordenada por el nombre, y a igual nombre
     * primero los que hayan nacido antes.
     * 3. El método muestraListaPersona debe de mostrar las personas ordenadas
     * según el punto anterior
     * 4. Añade un nuevo método llamado muestraListaPersonaDNI que muestra a las
     * personas ordenadas por su DNI<
     */

        public static void main(String[] args) {
            Agenda agenda = new Agenda();
            Persona p1 = new Persona("Andres", "12345678M", LocalDate.now());
            Persona p2 = new Persona("Maria", "78643286K", LocalDate.of(2020, 1, 1));
            Persona p3 = new Persona("Andres", "39514481Q", LocalDate.of(2005,9,8));
            Persona p4 = new Persona("Beatriz", "98765432P", LocalDate.of(1998,3,4));

            agenda.aniadePersona(p1);
            agenda.aniadePersona(p2);
            agenda.aniadePersona(p3);
            agenda.aniadePersona(p4);

            String prueba1 = agenda.muestraListaPersona();
            String prueba2 = agenda.muestraListaPersonaDNI();

            System.out.println(prueba1);
            System.out.println(prueba2);

        }




}
