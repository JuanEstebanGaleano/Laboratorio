package Escenario3ListaReproduccion;

public class Reproductor {
    private ListaCircularSimple lista;

    public Reproductor() {
        lista = new ListaCircularSimple();
    }

    public void agregarCancion(String nombre, String artista) {
        lista.agregar(new Cancion(nombre, artista));
    }

    public void siguiente() {
        lista.siguiente();
    }

    public void mostrarActual() {
        System.out.println("Reproduciendo: " + lista.actual());
    }
}