public class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = this.tope;
        this.tope = nuevoNodo;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T datoRetornado = this.tope.dato;
        this.tope = this.tope.siguiente;
        return datoRetornado;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return this.tope.dato;
    }

    public boolean isEmpty() {
        return this.tope == null;
    }

    public void vaciar() {
        this.tope = null;
    }
}