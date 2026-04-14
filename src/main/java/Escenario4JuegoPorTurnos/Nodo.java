package Escenario4JuegoPorTurnos;

public class Nodo {
    Jugador jugador;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Jugador jugador) {
        this.jugador = jugador;
        this.siguiente = this;
        this.anterior = this;
    }
}