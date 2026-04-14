package Escenario4JuegoPorTurnos;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();

        juego.agregarJugador("Juan");
        juego.agregarJugador("Ana");
        juego.agregarJugador("Luis");

        juego.mostrarTurnoActual();

        juego.siguienteTurno();
        juego.mostrarTurnoActual();

        juego.turnoAnterior();
        juego.mostrarTurnoActual();
    }
}
