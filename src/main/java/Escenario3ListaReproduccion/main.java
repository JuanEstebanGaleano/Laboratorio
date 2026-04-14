package Escenario3ListaReproduccion;
public class main {
    public static void main(String[] args) {
        Reproductor r = new Reproductor();

        r.agregarCancion("Song 1", "Artista A");
        r.agregarCancion("Song 2", "Artista B");

        r.mostrarActual();
        r.siguiente();
        r.mostrarActual();
    }
}