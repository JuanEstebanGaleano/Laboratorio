package Escenario2HistorialWeb;

public class MainBrowsing {
    public static void main(String[] args) {

        Navegador navegador = new Navegador("MiNavegador");

        System.out.println();
        navegador.visitarPagina("google.com");
        navegador.visitarPagina("wikipedia.org");
        navegador.visitarPagina("github.com");

        System.out.println();
        navegador.mostrarHistorial();

        System.out.println();
        navegador.retroceder();
        navegador.retroceder();

        System.out.println();
        navegador.mostrarPaginaActual();

        System.out.println();
        navegador.avanzar();

        System.out.println();
        navegador.visitarPagina("stackoverflow.com");

        System.out.println();
        navegador.mostrarHistorial();

        System.out.println();
        navegador.avanzar();
    }
}