import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor numérico a convertir: ");
        double valor = scanner.nextDouble();

        System.out.println("Seleccione la conversión:");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = valor * 0.621371;
                System.out.println(valor + " km son " + resultado + " millas.");
                break;
            case 2:
                resultado = (valor * 9 / 5) + 32;
                System.out.println(valor + " °C son " + resultado + " °F.");
                break;
            case 3:
                resultado = valor * 3.28084;
                System.out.println(valor + " m son " + resultado + " pies.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
