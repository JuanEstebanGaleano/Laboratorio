package Escenario4JuegoPorTurnos;

public class Main {
    public static void main(String[] args) {
        JuegoTurnos juego = new JuegoTurnos();
        juego.agregar("Ana");
        juego.agregar("Pedro");
        juego.agregar("Sofía");
        juego.agregar("Tomás");
        juego.mostrar();
        juego.siguiente();          // Pedro
        juego.siguiente();          // Sofía
        juego.anterior();           // Pedro
        juego.eliminar("Sofía");    // expulsada
        juego.buscar("Tomás");
        juego.mostrar();
        // demostrar ciclo continuo
        juego.siguiente();
        juego.siguiente();
        juego.siguiente();
    }
}

