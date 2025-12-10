import java.util.Scanner;

public class ClasificadorCalificaciones {

    // Función para clasificar la calificación
    public static String clasificarCalificacion(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return "Sobresaliente";
        } else if (calificacion >= 80 && calificacion <= 89) {
            return "Notable";
        } else if (calificacion >= 70 && calificacion <= 79) {
            return "Aprobatorio";
        } else if (calificacion >= 0 && calificacion <= 69) {
            return "Reprobatorio";
        } else {
            return "Calificación inválida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la calificación (0-100): ");
        int calificacion = scanner.nextInt();

        String resultado = clasificarCalificacion(calificacion);
        System.out.println("El resultado es: " + resultado);
        
        scanner.close();
    }
}
