package Escenario4JuegoPorTurnos;

public class NodoCircularDoble {
    String jugador;
    NodoCircularDoble siguiente;
    NodoCircularDoble anterior;

    public NodoCircularDoble(String jugador) {
        this.jugador = jugador;
        this.siguiente = null;
        this.anterior = null;
    }
}