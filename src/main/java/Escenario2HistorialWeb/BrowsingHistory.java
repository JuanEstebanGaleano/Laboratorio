package Escenario2HistorialWeb;

public class BrowsingHistory {
    private DoubleKnot actual;

    public BrowsingHistory() {
        this.actual = null;
    }

    public void visitar(String url) {
        DoubleKnot nuevo = new DoubleKnot(url);
        if (actual != null) {
            actual.siguiente = nuevo;   // elimina páginas futuras
            nuevo.anterior = actual;
        }
        actual = nuevo;
        System.out.println("Visitando: " + url);
    }

  public void retroceder() {
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay página anterior.");
            return;
        }
        actual = actual.anterior;
        System.out.println("Retrocediendo a: " + actual.url);
    }

    public void avanzar() {
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay página siguiente.");
            return;
        }
        actual = actual.siguiente;
        System.out.println("Avanzando a: " + actual.url);
    }

    public void eliminar() {
        if (actual == null) {
            System.out.println("Historial vacío.");
            return;
        }
        System.out.println("Eliminando: " + actual.url);
        if (actual.anterior != null) actual.anterior.siguiente = actual.siguiente;
        if (actual.siguiente != null) actual.siguiente.anterior = actual.anterior;
        actual = (actual.anterior != null) ? actual.anterior : actual.siguiente;
    }

    public boolean buscar(String url) {
        DoubleKnot temp = actual;
        while (temp != null && temp.anterior != null) temp = temp.anterior; // ir al inicio
        while (temp != null) {
            if (temp.url.equals(url)) {
                System.out.println("URL encontrada en el historial: " + url);
                return true;
            }
            temp = temp.siguiente;
        }
        System.out.println("URL no encontrada: " + url);
        return false;
    }
    public void mostrar() {
        if (actual == null) {
            System.out.println("Historial vacío.");
            return;
        }
        DoubleKnot temp = actual;
        while (temp.anterior != null) temp = temp.anterior;

        System.out.println("=== Historial de navegación ===");
        while (temp != null) {
            String marca = (temp == actual) ? "  <-- actual" : "";
            System.out.println("  " + temp.url + marca);
            temp = temp.siguiente;
        }
    }
}
