package Escenario3ListaReproduccion;

public class ListaReproduccion {
    private NodoCircular ultimo;   // apunta al último; ultimo.siguiente = primero
    private NodoCircular actual;
    private int tamanio;

    public ListaReproduccion() {
        this.ultimo = null;
        this.actual = null;
        this.tamanio = 0;
    }

    // Agregar canción al final de la lista
    public void agregar(String cancion) {
        NodoCircular nuevo = new NodoCircular(cancion);
        if (ultimo == null) {
            nuevo.siguiente = nuevo;
            ultimo = nuevo;
            actual = nuevo;
        } else {
            nuevo.siguiente = ultimo.siguiente;  // nuevo → primero
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tamanio++;
        System.out.println("Agregada: " + cancion);
    }

    // Avanzar a la siguiente canción (ciclo continuo)
    public void siguiente() {
        if (actual == null) {
            System.out.println("Lista vacía.");
            return;
        }
        actual = actual.siguiente;
        System.out.println("♪ Reproduciendo: " + actual.cancion);
    }

    // Eliminar una canción por nombre
    public void eliminar(String cancion) {
        if (ultimo == null) {
            System.out.println("Lista vacía.");
            return;
        }
        NodoCircular anterior = ultimo;
        NodoCircular temp = ultimo.siguiente;  // comenzar desde el primero

        for (int i = 0; i < tamanio; i++) {
            if (temp.cancion.equals(cancion)) {
                if (tamanio == 1) {
                    ultimo = null;
                    actual = null;
                } else {
                    anterior.siguiente = temp.siguiente;
                    if (temp == ultimo) ultimo = anterior;
                    if (temp == actual) actual = anterior.siguiente;
                }
                tamanio--;
                System.out.println("Eliminada: " + cancion);
                return;
            }
            anterior = temp;
            temp = temp.siguiente;
        }
        System.out.println("Canción no encontrada: " + cancion);
    }

    // Buscar canción por nombre
    public boolean buscar(String cancion) {
        if (ultimo == null) return false;
        NodoCircular temp = ultimo.siguiente;
        for (int i = 0; i < tamanio; i++) {
            if (temp.cancion.equals(cancion)) {
                System.out.println("Canción encontrada: " + cancion);
                return true;
            }
            temp = temp.siguiente;
        }
        System.out.println("Canción no encontrada: " + cancion);
        return false;
    }

    // Mostrar secuencia actual de canciones
    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacía.");
            return;
        }
        System.out.println("=== Lista de reproducción ===");
        NodoCircular temp = ultimo.siguiente;
        for (int i = 0; i < tamanio; i++) {
            String marca = (temp == actual) ? "  ♪ reproduciendo" : "";
            System.out.println("  " + (i + 1) + ". " + temp.cancion + marca);
            temp = temp.siguiente;
        }
        System.out.println("  (vuelve al inicio → " + ultimo.siguiente.cancion + ")");
    }
}