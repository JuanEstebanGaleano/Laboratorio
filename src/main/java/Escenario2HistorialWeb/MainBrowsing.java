package Escenario2HistorialWeb;

public class MainBrowsing {
    public static void main(String[] args) {
        BrowsingHistory nav = new BrowsingHistory();
        nav.visitar("google.com");
        nav.visitar("github.com");
        nav.visitar("stackoverflow.com");
        nav.mostrar();
        nav.retroceder();
        nav.retroceder();
        nav.avanzar();
        nav.visitar("openai.com");
        nav.mostrar();
        nav.buscar("github.com");
    }
}
