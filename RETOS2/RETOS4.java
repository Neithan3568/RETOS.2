public class RETOS4 {
    public static void main(String[] args) {
        // Crear matrices para diferentes emojis
        int[][] happy = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0}
        };
        
        int[][] sad = {
            {0, 1, 0},
            {1, 0, 1},
            {1, 0, 1}
        };
        
        int[][] heart = {
            {0, 1, 0},
            {1, 1, 1},
            {1, 1, 1}
        };
        
        // Mostrar los emojis en la consola
        mostrarEmoji(happy);
        mostrarEmoji(sad);
        mostrarEmoji(heart);
    }
    
    // Función para mostrar una matriz como un emoji en la consola
    public static void mostrarEmoji(int[][] emoji) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (emoji[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("\u2B1B ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}