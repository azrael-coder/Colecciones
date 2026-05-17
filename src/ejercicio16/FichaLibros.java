package ejercicio16;
import java.util.LinkedList;

public class FichaLibros {
    LinkedList<Libros> pila = new LinkedList<>();

    public void añadirLibro(Libros libro) {
        if (libro != null) {
            pila.push(libro);
        }
    }


    public String viualizarPila(){
        LinkedList<Libros> pilaAux = this.pila;
        StringBuilder retorno = new StringBuilder();

        if (pila.isEmpty()) {
            retorno.append("No hay libros encontrado");
        }
        while (!pila.isEmpty()) {
            retorno.append( pilaAux.pop() ).append("\n");
        }

        return retorno.toString();
    }

    public void fichar(){
        while (!pila.isEmpty()) {
            Libros libro = pila.pop();

            System.out.println("Fichando libro con codigo: " + libro.getCodigo() );

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println("Fichando");
                Thread.currentThread().interrupt();
            }

            System.out.println("Fichado libro: " + libro.getCodigo() );
        }
    }




}
