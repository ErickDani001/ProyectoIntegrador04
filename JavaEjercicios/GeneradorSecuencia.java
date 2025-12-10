import java.util.Scanner;

public class GeneradorSecuencia {

    // Función para generar la secuencia
    public static void generarSecuencia(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo (N): ");
        int n = scanner.nextInt();

        generarSecuencia(n);

        scanner.close();
    }
}
//