package ejercicio14;
import java.util.Collections;
import java.util.LinkedList;
/**
 * Gestiona la cola de vehículos en espera y en reparación de un taller.
 */
public class GestionReparaciones  {

     private LinkedList<Vehiculo> enEspera = new LinkedList<>();
     private LinkedList<Vehiculo> enReparacion = new LinkedList<>();

    /**
     * Añade un nuevo vehículo a la cola de espera.
     * @param v el vehículo a añadir
     * @return true si se añadió correctamente, false si el vehículo era null
     */
    public boolean añadeVehiculo(Vehiculo v){
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
        for (Vehiculo v: enEspera){
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
        for (Vehiculo v: enReparacion){
            resultado +="Matricula: " + v.getMatricula() + "\n";
        }

        return resultado;
    }

    /**
     * Muestra por consola todos los vehículos en espera ordenados por matrícula.
     */
    public void listarOrdenadasMatricula(){
        LinkedList<Vehiculo> ordenada= new LinkedList<>(enEspera);
        Collections.sort(ordenada);

        for (Vehiculo v: ordenada) {
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
        LinkedList<Vehiculo> ordenada= new LinkedList<>(enEspera);

        ordenada.sort((v1, v2) -> {
            int resultado;

            if (v1 == null && v2 == null) resultado = 0;

            else if (v1 != null && v2 == null) resultado = -1;

            else if (v1 == null) resultado = 1;

            else resultado = v1.getFecha().compareTo(v2.getFecha());

            return resultado;
        });

        Collections.reverse(ordenada);

        System.out.println("===Vehículos en espera ordenados por fecha===");
        for (Vehiculo v : ordenada) {
            System.out.println("Modelo: " + v.getModelo() +
                    " | Matrícula: " + v.getMatricula() +
                    " | Fecha: " + v.getFecha());
        }
    }

}
