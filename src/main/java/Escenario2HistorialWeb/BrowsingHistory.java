package Escenario2HistorialWeb;

public class BrowsingHistory {
    private DoubleKnot actual;

    public BrowsingHistory() {
        this.actual = null;
    }

    // Visita una nueva página: elimina el historial futuro y agrega al final
    public void visitarPagina(String url) {
        DoubleKnot nuevo = new DoubleKnot(url);

        if (actual == null) {
            actual = nuevo;
        } else {
            // Eliminar páginas futuras
            actual.siguiente = null;

            // Enlazar nuevo nodo después del actual
            nuevo.anterior = actual;
            actual.siguiente = nuevo;
            actual = nuevo;
        }
        System.out.println("Visitando: " + url);
    }

    // Retrocede a la página anterior
    public void retroceder() {
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay página anterior.");
        } else {
            actual = actual.anterior;
            System.out.println("Retrocediendo a: " + actual.dato);
        }
    }

    // Avanza a la siguiente página
    public void avanzar() {
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay página siguiente.");
        } else {
            actual = actual.siguiente;
            System.out.println("Avanzando a: " + actual.dato);
        }
    }

    // Muestra la página actual
    public void paginaActual() {
        if (actual == null) {
            System.out.println("El navegador está vacío.");
        } else {
            System.out.println("Página actual: " + actual.dato);
        }
    }

    // Muestra todo el historial
    public void mostrarHistorial() {
        if (actual == null) {
            System.out.println("No hay historial.");
            return;
        }

        DoubleKnot inicio = actual;
        while (inicio.anterior != null) {
            inicio = inicio.anterior;
        }

        System.out.println("=== Historial de navegación ===");
        DoubleKnot temp = inicio;
        int i = 1;
        while (temp != null) {
            if (temp == actual) {
                System.out.println("  [" + i + "] >>> " + temp.dato + " <<< (actual)");
            } else {
                System.out.println("  [" + i + "]     " + temp.dato);
            }
            temp = temp.siguiente;
            i++;
        }
    }
}