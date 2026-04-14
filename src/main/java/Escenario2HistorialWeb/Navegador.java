package Escenario2HistorialWeb;

public class Navegador {
    private BrowsingHistory historial;
    private String nombreNavegador;

    public Navegador(String nombreNavegador) {
        this.nombreNavegador = nombreNavegador;
        this.historial = new BrowsingHistory();
        System.out.println("=== " + nombreNavegador + " iniciado ===");
    }

    public void visitarPagina(String url) {
        historial.visitarPagina(url);
    }

    public void retroceder() {
        historial.retroceder();
    }

    public void avanzar() {
        historial.avanzar();
    }

    public void mostrarPaginaActual() {
        historial.paginaActual();
    }

    public void mostrarHistorial() {
        historial.mostrarHistorial();
    }
}