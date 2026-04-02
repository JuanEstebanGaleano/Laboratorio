package Escenario3ListaReproduccion;
public class main {
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();
        lista.agregar("Bohemian Rhapsody");
        lista.agregar("Hotel California");
        lista.agregar("Stairway to Heaven");
        lista.mostrar();
        lista.siguiente();
        lista.siguiente();
        lista.eliminar("Hotel California");
        lista.buscar("Stairway to Heaven");
        lista.mostrar();
        // demostrar que el ciclo continúa infinitamente
        lista.siguiente();
        lista.siguiente();
        lista.siguiente();
    }
}