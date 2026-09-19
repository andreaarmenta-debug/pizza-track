import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();
        int opcion;

        do {
            System.out.println("\n=== PIZZA-TRACK: Gestion de Pedidos ===");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = scanner.nextLine();
                    String[] ingredientes = new String[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = scanner.nextLine();
                    }
                    gestion.registrarPedido(new Pizza(nombre, ingredientes));
                    break;
                case 2:
                    gestion.deshacer();
                    break;
                case 3:
                    gestion.rehacer();
                    break;
                case 4:
                    gestion.mostrarPedidoActual();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}