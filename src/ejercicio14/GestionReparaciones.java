package ejercicio14;

import java.util.LinkedList;

public class GestionReparaciones {
    LinkedList<FichaVehiculo> vEspera= new LinkedList<>();
    LinkedList<FichaVehiculo> vReparando= new LinkedList<>();

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


        return resultado;
    }

    public String verReparando(){
        return vReparando.toString();
    }
}
