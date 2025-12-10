import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "ingenieria2025";
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3) {
            System.out.print("Introduce la contraseña: ");
            String input = scanner.next();

            if (input.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido");
                accesoConcedido = true;
                break;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - intentos));
            }
        }

        if (!accesoConcedido) {
            System.out.println("Acceso denegado. Contacte a soporte.");
        }

        scanner.close();
    }
}
//