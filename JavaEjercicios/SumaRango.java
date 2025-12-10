import java.util.Scanner;

public class SumaRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        // Solicitar A y B asegurando A <= B
        do {
            System.out.print("Ingrese el inicio del rango (A): ");
            A = scanner.nextInt();
            System.out.print("Ingrese el fin del rango (B): ");
            B = scanner.nextInt();

            if (A > B) {
                System.out.println("Error: A debe ser menor o igual a B. Intente de nuevo.");
            }
        } while (A > B);

        int suma = 0;

        for (int i = A; i <= B; i++) {
            suma += i;
        }
        System.out.println("La suma de los números entre " + A + " y " + B + " es: " + suma);

        scanner.close();
    }
}
