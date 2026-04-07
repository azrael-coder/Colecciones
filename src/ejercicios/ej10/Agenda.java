package ejercicios.ej10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Agenda  {
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

        if (validarDni(persona.getDni() ) ){
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
            //Ordenar ArrayList por los nombres y alfabeticamente
            personas.sort(Comparator.comparing(Persona::getNombre)); // <-- Esto: Es equivalente a esto --> p.getNombre()

            //El metodo sort() del ArrayList reordena los elementos modificando la propia lista
            //segun el criterio que se le pase como argumento en, aqui es el Comparator

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            resultado += " Nombre: " + p.getNombre() + " DNI: " + p.getDni() + "\n";

        }
        return resultado;
    }

}
