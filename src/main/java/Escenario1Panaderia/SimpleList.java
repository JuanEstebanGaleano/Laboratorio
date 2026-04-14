package Escenario1Panaderia;

public class SimpleList {
    private Knot cabeza;

    public SimpleList() {
        this.cabeza = null;
    }

    // Agrega un cliente al final de la fila
    public void agregar(String cliente) {
        Knot nuevo = new Knot(cliente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Knot actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        System.out.println("Turno registrado: " + cliente);
    }

    // Elimina y retorna el primer cliente (FIFO)
    public String atender() {
        if (cabeza == null) {
            System.out.println("No hay clientes en espera.");
            return null;
        }
        String cliente = cabeza.dato;
        cabeza = cabeza.siguiente;
        System.out.println("Atendiendo a: " + cliente);
        return cliente;
    }

    // Consulta quién es el siguiente sin eliminarlo
    public void siguienteTurno() {
        if (cabeza == null) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Siguiente en ser atendido: " + cabeza.dato);
        }
    }

    // Busca si un cliente está en la fila
    public boolean buscar(String cliente) {
        Knot actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(cliente)) {
                System.out.println(cliente + " está en la fila.");
                return true;
            }
            actual = actual.siguiente;
        }
        System.out.println(cliente + " no está en la fila.");
        return false;
    }

    // Muestra todos los turnos actuales
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay turnos en espera.");
            return;
        }
        System.out.println("=== Lista de turnos ===");
        Knot actual = cabeza;
        int turno = 1;
        while (actual != null) {
            System.out.println("  Turno " + turno + ": " + actual.dato);
            actual = actual.siguiente;
            turno++;
        }
    }

    // Indica si la fila está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }
}