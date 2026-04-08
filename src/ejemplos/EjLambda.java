package ejemplos;

import ejercicios.ej10.Persona;

import java.util.ArrayList;
import java.util.Collections;

public class EjLambda {
    public static void main(String[] args) {
        ArrayList<Persona> list = new ArrayList<Persona>();





        //===LAMBDA DE UNA SOLA LINEA EN EL CUERPO===//
        Collections.sort(list, ( p1, p2) ->
            p1.getDni().compareToIgnoreCase(p2.getDni() )
        );

    }
}
