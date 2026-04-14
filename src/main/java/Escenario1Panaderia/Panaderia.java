package Escenario1Panaderia;

public class Panaderia {
    private SimpleList filaDeTurnos;
    private String nombre;

    public Panaderia(String nombre) {
        this.nombre = nombre;
        this.filaDeTurnos = new SimpleList();
        System.out.println("=== Panadería \"" + nombre + "\" abierta ===");
    }

    // Registra un nuevo cliente al final de la fila
    public void registrarCliente(String cliente) {
        filaDeTurnos.agregar(cliente);
    }

    // Atiende al primer cliente en espera
    public void atenderSiguiente() {
        filaDeTurnos.atender();
    }

    // Consulta quién es el siguiente sin atenderlo
    public void consultarSiguiente() {
        filaDeTurnos.siguienteTurno();
    }

    // Busca si un cliente está en la fila
    public void buscarCliente(String cliente) {
        filaDeTurnos.buscar(cliente);
    }

    // Muestra la lista completa de turnos
    public void mostrarTurnos() {
        filaDeTurnos.mostrar();
    }
}