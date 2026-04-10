package ejercicio14;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<FichaVehiculo> {


    @Override
    public int compare(FichaVehiculo o1, FichaVehiculo o2) {
        int resultado;

        if (o1 == null && o2 == null)  resultado = 0;

        else if (o1 != null && o2 ==null)  resultado = -1;

        else if (o1 == null && o2 != null)  resultado = 1;

        else resultado = o1.getFecha().compareTo(o2.getFecha());

        return resultado;
    }
}
