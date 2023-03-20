import java.util.Arrays;
import java.util.Scanner;

public class reto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de competidores: ");
        int numCompetidores = scanner.nextInt();

        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];

        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = scanner.next();

            System.out.print("Ingrese el tiempo del competidor " + (i+1) + " (en segundos): ");
            tiempos[i] = scanner.nextDouble();
        }

        // ordenar competidores por tiempo
        double[] tiemposOrdenados = tiempos.clone();
        Arrays.sort(tiemposOrdenados);

        // imprimir lista de competidores con sus tiempos
        System.out.println("\nLista de competidores con sus respectivos tiempos:");
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }

        // determinar ganador
        String ganador = "";
        double mejorTiempo = Double.MAX_VALUE;
        for (int i = 0; i < numCompetidores; i++) {
            if (tiempos[i] == tiemposOrdenados[0]) {
                ganador = nombres[i];
                mejorTiempo = tiempos[i];
                break;
            }
        }
        System.out.println("\nEl ganador es " + ganador + " con un tiempo de " + mejorTiempo + " segundos");

        scanner.close();
    }

}
