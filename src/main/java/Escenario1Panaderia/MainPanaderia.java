package Escenario1Panaderia;

public class MainPanaderia {
    public static void main(String[] args) {

        SimpleList panaderia = new SimpleList();
        panaderia.agregar("Carlos");
        panaderia.agregar("María");
        panaderia.agregar("Luis");
        panaderia.mostrar();
        panaderia.siguienteTurno();
        panaderia.atender();
        panaderia.buscar("Luis");
        panaderia.mostrar();
    }
}
