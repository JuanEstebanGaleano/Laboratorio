package Escenario1Panaderia;

public class MainPanaderia {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia("La Esquina Dorada");

        System.out.println();
        panaderia.registrarCliente("Carlos");
        panaderia.registrarCliente("María");
        panaderia.registrarCliente("Luis");

        System.out.println();
        panaderia.mostrarTurnos();

        System.out.println();
        panaderia.consultarSiguiente();

        System.out.println();
        panaderia.atenderSiguiente();

        System.out.println();
        panaderia.buscarCliente("Luis");

        System.out.println();
        panaderia.mostrarTurnos();
    }
}