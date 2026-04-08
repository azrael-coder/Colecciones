package ejercicio14;

import java.util.LinkedList;

public class GestionReparaciones implements Comparable<FichaVehiculo> {

    LinkedList<FichaVehiculo> vEspera= new LinkedList<FichaVehiculo>();
    LinkedList<FichaVehiculo> vReparando= new LinkedList<FichaVehiculo>();

    public boolean añadeVehiculo(FichaVehiculo v){
        if(v != null) {
            vEspera.offer(v);
            return true;
        }
        return false;
    }

    public void reparar(){
        vReparando.offer(vEspera.pollFirst());
    }

    public String verEspera(){
        String resultado="";
        for (FichaVehiculo v: vEspera){
            resultado +="Matricula: "+ v.getMatricula() + "\n";
        }
        return resultado;
    }

    public String verReparando(){
        String resultado="";
        for (FichaVehiculo v: vReparando){
            resultado +="Matricula: " + v.getMatricula() + "\n";
        }

        return resultado;
    }

    @Override
    public int compareTo(FichaVehiculo o) {
        return 0; //vReparando.sort();
    }
}
