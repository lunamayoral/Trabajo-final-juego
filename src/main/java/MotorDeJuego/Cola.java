package MotorDeJuego;
import MotorDeJuego.Matematico;
import MotorDeJuego.Ciencias;
import MotorDeJuego.Letras;
import MotorDeJuego.Fisico;
import MotorDeJuego.Historiador;
import MotorDeJuego.Filologo;

public class Cola<T> {
    private ListaSimplementeEnlazada<T> cola;
    private Ciencias Matematico;
    private Ciencias Fisico;
    private Letras Historiador;
    private Letras Filologo;

    public Cola() {
        cola = new ListaSimplementeEnlazada<T>();
    }

    public void enqueue(T elemento) {
        // Si la cola está vacía, simplemente agrega el elemento
        if (cola.isEmpty()) {
            cola.add(elemento);
        } else {
            // Si no está vacía, obtenemos el último elemento y lo enlazamos
            ElementoSE<T> nuevoElemento = new ElementoSE<>(elemento);
            ElementoSE<T> ultimo = cola.getUltimo();
            ultimo.setSiguiente(nuevoElemento);
        }
    }

    public T dequeue() {
        if (cola.isEmpty()) {
            return null;
        } else {
            T elemento = cola.getCabeza().getDato();
            cola.delete(elemento);
            return elemento;
        }
    }

    public boolean vacia() {
        return cola.isEmpty();
    }

    public int size() {
        return cola.getNumElementos();
    }

    public T peek() {
        if (cola.isEmpty()) {
            return null;
        } else {
            return cola.getCabeza().getDato();
        }
    }


    public Cola<Ciencias> ColaDeCiencias(){
        int cientificos = 0;
        int turno =1;
        Cola<Ciencias> colaciencias = new Cola<>();
        while (cientificos <20){
            if (turno%2==1){
                colaciencias.enqueue(Matematico);
                turno++;

            } else {
                colaciencias.enqueue(Fisico);
                turno++;

            }
            if (turno%3==0){
                colaciencias.dequeue();
                turno++;
            }

        }

        return colaciencias;
    }

    public Cola<Letras> ColaDeLetras(){
        int humanidades = 0;
        int turno =1;
        Cola<Letras> colaletras = new Cola<>();
        while (humanidades <20){
            if (turno%2==1){
                colaletras.enqueue(Historiador);
                turno++;

            } else {
                colaletras.enqueue(Filologo);
                turno++;

            }
            if (turno%3==0){
                colaletras.dequeue();
                turno++;
            }

        }

        return colaletras;
    }

}
