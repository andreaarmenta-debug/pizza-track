public class Pizza {
    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = new String[3];
        for (int i = 0; i < 3; i++) {
            this.ingredientes[i] = (ingredientes != null && i < ingredientes.length) ? ingredientes[i] : "N/A";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre + " | Ingredientes: [" + 
               ingredientes[0] + ", " + ingredientes[1] + ", " + ingredientes[2] + "]";
    }
}