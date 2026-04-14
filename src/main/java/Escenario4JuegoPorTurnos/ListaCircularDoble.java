package Escenario4JuegoPorTurnos;

public class ListaCircularDoble {
    Nodo cabeza;
    Nodo actual;

    public void agregar(Jugador j) {
        Nodo nuevo = new Nodo(j);

        if (cabeza == null) {
            cabeza = nuevo;
            actual = nuevo;
        } else {
            Nodo ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    public void siguiente() {
        if (actual != null) actual = actual.siguiente;
    }

    public void anterior() {
        if (actual != null) actual = actual.anterior;
    }

    public Jugador actual() {
        return (actual != null) ? actual.jugador : null;
    }
}