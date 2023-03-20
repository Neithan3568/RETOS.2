import java.util.Scanner;

public class reto4 {

    public static void main(String[] args) {
        
        // Crear una matriz vacía de 16 filas y 3 columnas
        double[][] maquina = new double[16][3];

        // Llenar la máquina con 16 nombres de productos y su respectivo precio
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 16; i++) {
            System.out.println("Producto " + i);
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());
            maquina[i][0] = i;
            maquina[i][1] = precio;
            maquina[i][2] = precio;
            System.out.println("Producto agregado: " + nombre + " con precio $" + precio);
        }

        // Mostrar el catálogo de productos con el código del producto (posición),
        // nombre y precio de cada producto ingresado
        System.out.println("\nCatálogo de productos:");
        System.out.println("Código\tNombre\t\tPrecio");
        for (int i = 0; i < 16; i++) {
            System.out.println((int)maquina[i][0] + "\t" + maquina[i][1] + "\t" + maquina[i][2]);
        }

        // Permitir que el usuario seleccione un producto
        System.out.print("\nIngrese el código del producto que desea comprar: ");
        int codigo = Integer.parseInt(sc.nextLine());
        double precioProducto = maquina[codigo][1];
        String nombreProducto = maquina[codigo][2] + "";

        // Permitir que el usuario ingrese la cantidad de productos que desea comprar
        System.out.print("Ingrese la cantidad de " + nombreProducto + " que desea comprar: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        // Calcular el total de la compra y mostrarlo al usuario
        double total = cantidad * precioProducto;
        System.out.println("El total de su compra es: $" + total);
sc.close();
    }

}

