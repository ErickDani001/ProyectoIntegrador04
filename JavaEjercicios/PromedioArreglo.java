import java.util.Scanner;

public class PromedioArreglo {

    // Función para calcular el promedio
    public static float calcularPromedio(float[] arreglo, int tamano) {
        float suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += arreglo[i];
        }
        return suma / tamano;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] calificaciones = new float[5];

        // Llenar el arreglo
        System.out.println("Introduce 5 calificaciones:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        // Calcular y mostrar promedio
        float promedio = calcularPromedio(calificaciones, 5);
        System.out.println("El promedio de las 5 calificaciones es: " + promedio);

        scanner.close();
    }
}
//