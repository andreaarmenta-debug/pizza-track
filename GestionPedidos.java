public class GestionPedidos {
    private Pila<Pizza> pilaPrincipal;
    private Pila<Pizza> pilaSecundaria;

    public GestionPedidos() {
        this.pilaPrincipal = new Pila<>();
        this.pilaSecundaria = new Pila<>();
    }

    public void registrarPedido(Pizza pizza) {
        pilaPrincipal.push(pizza);
        pilaSecundaria.vaciar();
        System.out.println("[OK] Pedido registrado exitosamente.");
    }

    public void deshacer() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println("[AVISO] No hay pedidos para deshacer.");
            return;
        }
        Pizza pizzaDeshecha = pilaPrincipal.pop();
        pilaSecundaria.push(pizzaDeshecha);
        System.out.println("[UNDO] Deshaciendo: " + pizzaDeshecha.getNombre());
    }

    public void rehacer() {
        if (pilaSecundaria.isEmpty()) {
            System.out.println("[AVISO] No hay pedidos para rehacer.");
            return;
        }
        Pizza pizzaRehecha = pilaSecundaria.pop();
        pilaPrincipal.push(pizzaRehecha);
        System.out.println("[REDO] Rehaciendo: " + pizzaRehecha.getNombre());
    }

    public void mostrarPedidoActual() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println("[INFO] No hay pedidos en cola de produccion.");
            return;
        }
        Pizza actual = pilaPrincipal.peek();
        System.out.println("[ACTUAL] Pedido listo: " + actual.toString());
    }
}