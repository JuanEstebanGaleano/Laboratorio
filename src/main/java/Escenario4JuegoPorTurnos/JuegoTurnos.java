package Escenario4JuegoPorTurnos;

public class JuegoTurnos {
    private NodoCircularDoble actual;
    private int tamanio;

    public JuegoTurnos() {
        this.actual = null;
        this.tamanio = 0;
    }

    // Agregar jugador a la mesa (inserta antes de actual, cerrando el ciclo)
    public void agregar(String jugador) {
        NodoCircularDoble nuevo = new NodoCircularDoble(jugador);
        if (actual == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            actual = nuevo;
        } else {
            NodoCircularDoble ultimo = actual.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = actual;
            actual.anterior = nuevo;
        }
        tamanio++;
        System.out.println("Jugador agregado: " + jugador);
    }

    // Pasar al siguiente jugador
    public void siguiente() {
        if (actual == null) {
            System.out.println("No hay jugadores.");
            return;
        }
        actual = actual.siguiente;
        System.out.println("Turno de: " + actual.jugador);
    }

    // Consultar quién jugó antes (retroceder)
    public void anterior() {
        if (actual == null) {
            System.out.println("No hay jugadores.");
            return;
        }
        actual = actual.anterior;
        System.out.println("Turno de: " + actual.jugador);
    }

    // Expulsar un jugador de la partida
    public void eliminar(String jugador) {
        if (actual == null) {
            System.out.println("No hay jugadores.");
            return;
        }
        NodoCircularDoble temp = actual;
        for (int i = 0; i < tamanio; i++) {
            if (temp.jugador.equals(jugador)) {
                if (tamanio == 1) {
                    actual = null;
                } else {
                    temp.anterior.siguiente = temp.siguiente;
                    temp.siguiente.anterior = temp.anterior;
                    if (temp == actual) actual = temp.siguiente;
                }
                tamanio--;
                System.out.println("Jugador expulsado: " + jugador);
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("Jugador no encontrado: " + jugador);
    }

    // Buscar jugador por nombre
    public boolean buscar(String jugador) {
        if (actual == null) return false;
        NodoCircularDoble temp = actual;
        for (int i = 0; i < tamanio; i++) {
            if (temp.jugador.equals(jugador)) {
                System.out.println("Jugador encontrado: " + jugador);
                return true;
            }
            temp = temp.siguiente;
        }
        System.out.println("Jugador no encontrado: " + jugador);
        return false;
    }

    // Mostrar todos los jugadores en orden de turno
    public void mostrar() {
        if (actual == null) {
            System.out.println("No hay jugadores en la partida.");
            return;
        }
        System.out.println("=== Jugadores en la mesa ===");
        NodoCircularDoble temp = actual;
        for (int i = 0; i < tamanio; i++) {
            String marca = (i == 0) ? "  <-- turno actual" : "";
            System.out.println("  " + (i + 1) + ". " + temp.jugador + marca);
            temp = temp.siguiente;
        }
        System.out.println("  (ciclo: " + actual.anterior.jugador
                + " → " + actual.jugador + " → ...)");
    }
}