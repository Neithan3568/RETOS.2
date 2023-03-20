public class RETOS5 {
    public static void main(String[] args) {
        // Crear vectores para diferentes marcas de carros
        String[] toyota = {"Corolla", "Camry", "Rav4"};
        String[] honda = {"Civic", "Accord", "CR-V"};
        String[] ford = {"Mustang", "F-150", "Explorer"};
        
        // Mostrar las marcas de carros en la consola
        System.out.println("Toyota:");
        mostrarMarcas(toyota);
        System.out.println("Honda:");
        mostrarMarcas(honda);
        System.out.println("Ford:");
        mostrarMarcas(ford);
    }
    
    // Función para mostrar los modelos de una marca de carro en la consola
    public static void mostrarMarcas(String[] marcas) {
        for (int i = 0; i < marcas.length; i++) {
            System.out.println("- " + marcas[i]);
        }
        System.out.println();
    }
}
