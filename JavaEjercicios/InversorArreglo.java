import java.util.Scanner;

public class InversorArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Pedir al usuario que llene el arreglo
        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimir en orden inverso
        System.out.println("\nElementos en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
//