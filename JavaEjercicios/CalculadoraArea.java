import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular área de un Círculo");
        System.out.println("2. Calcular área de un Rectángulo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double area = 0;

        if (opcion == 1) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
        } else if (opcion == 2) {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();
            area = base * altura;
        } else {
            System.out.println("Opción no válida.");
            scanner.close();
            return;
        }

        System.out.println("El área calculada es: " + area);

        if (area > 100) {
            System.out.println("El área es mayor que 100 unidades cuadradas.");
        } else {
            System.out.println("El área es menor o igual a 100 unidades cuadradas.");
        }

        scanner.close();

    }
}
