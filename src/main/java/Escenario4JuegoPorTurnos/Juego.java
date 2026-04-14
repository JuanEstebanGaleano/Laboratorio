package Escenario4JuegoPorTurnos;

public class Juego {
    private ListaCircularDoble jugadores;

    public Juego() {
        jugadores = new ListaCircularDoble();
    }

    public void agregarJugador(String nombre) {
        jugadores.agregar(new Jugador(nombre));
    }

    public void siguienteTurno() {
        jugadores.siguiente();
    }

    public void turnoAnterior() {
        jugadores.anterior();
    }

    public void mostrarTurnoActual() {
        System.out.println("Turno de: " + jugadores.actual());
    }
}