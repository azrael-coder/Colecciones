package ejercicio14;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
/**
 * Gestiona la cola de vehículos en espera y en reparación de un taller.
 */
public class GestionReparaciones  {

     private LinkedList<FichaVehiculo> enEspera = new LinkedList<>();
     private LinkedList<FichaVehiculo> enReparacion = new LinkedList<>();

    /**
     * Añade un nuevo vehículo a la cola de espera.
     * @param v el vehículo a añadir
     * @return true si se añadió correctamente, false si el vehículo era null
     */
    public boolean añadeVehiculo(FichaVehiculo v){
        if(v != null) {
            enEspera.offer(v);// offer() añade al final de la lista
            return true;
        }
        return false;
    }

    /**
     * Pasa el primer vehículo de la cola de espera a reparación.
     */
    public void reparar(){
        // No había vehículos pendientes
        if (enEspera.isEmpty()){
            System.out.println("No hay vehiculos");
        }
        else {
            enReparacion.offer(enEspera.pollFirst());
        }
    }

    /**
     * Devuelve una cadena con la lista de vehículos en espera.
     * @return String con las matrículas de los vehículos en espera
     */
    public String verEspera(){
        String resultado="";
        for (FichaVehiculo v: enEspera){
            resultado +="Matricula: "+ v.getMatricula() + "\n";
        }
        return resultado;
    }

    /**
     * Devuelve una cadena con la lista de vehículos actualmente en reparación.

     * @return String con las matrículas de los vehículos en reparación
     */
    public String verReparando(){
        String resultado="";
        for (FichaVehiculo v: enReparacion){
            resultado +="Matricula: " + v.getMatricula() + "\n";
        }

        return resultado;
    }

    /**
     * Muestra por consola todos los vehículos en espera ordenados por matrícula.
     */
    public void listarOrdenadasMatricula(){
        LinkedList<FichaVehiculo> ordenada= new LinkedList<>(enEspera);
        Collections.sort(ordenada);

        for (FichaVehiculo v: ordenada) {
            System.out.println("Modelo: " + v.getModelo() +
                    " | Matrícula: " + v.getMatricula() +
                    " | Fecha: " + v.getFecha());
        }
    }

    /**
     * Muestra por consola los vehículos en espera ordenados por fecha de entrada.
     * Los más recientes aparecen primero.
     */
    public void listarOrdenadasFechaEntrada(){
        LinkedList<FichaVehiculo> ordenada= new LinkedList<>(enEspera);
        Collections.sort(ordenada, new ComparadorFecha());
        //Comparator<FichaVehiculo> porFecha = (v1, v2) -> v2.getFecha().compareTo(v1.getFecha());
        Collections.reverse(ordenada);

        System.out.println("===Vehículos en espera ordenados por fecha===");
        for (FichaVehiculo v : ordenada) {
            System.out.println("Modelo: " + v.getModelo() +
                    " | Matrícula: " + v.getMatricula() +
                    " | Fecha: " + v.getFecha());
        }
    }

}
