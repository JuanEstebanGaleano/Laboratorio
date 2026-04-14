package Escenario3ListaReproduccion;

public class Cancion {
    private String nombre;
    private String artista;

    public Cancion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return nombre + " - " + artista;
    }
}