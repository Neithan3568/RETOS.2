import java.util.Scanner;

public class reto5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario la cantidad de notas
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = sc.nextInt();

        // Creamos un array vacío para almacenar las notas
        double[] notas = new double[cantidadNotas];

        // Pedimos al usuario el valor de cada nota y las agregamos al array
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            double nota = sc.nextDouble();
            notas[i] = nota;
        }

        // Calculamos el promedio de las notas
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;

        // Imprimimos el promedio y la nota final correspondiente
        if (promedio < 3) {
            System.out.printf("Tu nota final es %.1f. Reprobaste.\n", promedio);
        } else if (promedio < 4) {
            System.out.printf("Tu nota final es %.1f. Pasaste raspando.\n", promedio);
        } else {
            System.out.printf("Tu nota final es %.1f. Aprobaste con buenos resultados.\n", promedio);
        }

        sc.close();
    }

}

