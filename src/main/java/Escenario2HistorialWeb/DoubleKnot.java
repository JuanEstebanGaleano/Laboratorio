package Escenario2HistorialWeb;

public class DoubleKnot {
        String url;
        DoubleKnot siguiente;
        DoubleKnot anterior;

        public DoubleKnot(String url) {
            this.url = url;
            this.siguiente = null;
            this.anterior = null;
        }
}