package Escenario3ListaReproduccion;

public class NodoCircular {
    String cancion;
    NodoCircular siguiente;

    public NodoCircular(String cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }
}