package Escenario3ListaReproduccion;

public class ListaCircularSimple {
    Nodo cabeza;
    Nodo actual;

    public void agregar(Cancion c) {
        Nodo nuevo = new Nodo(c);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            actual = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public Cancion actual() {
        return (actual != null) ? actual.cancion : null;
    }

    public void mostrar() {
        if (cabeza == null) return;

        Nodo temp = cabeza;
        do {
            System.out.println(temp.cancion);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}