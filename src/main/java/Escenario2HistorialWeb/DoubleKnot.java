package Escenario2HistorialWeb;


public class DoubleKnot {
    String dato;
    DoubleKnot siguiente;
    DoubleKnot anterior;

    public DoubleKnot(String dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}