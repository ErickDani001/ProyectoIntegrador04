import java.util.Scanner;

public class BusquedaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 25, 5, 40, 15, 30, 20}; // Arreglo de 7 números
        
        System.out.print("Ingresa el número a buscar: ");
        int numeroBuscado = scanner.nextInt();
        
        int i = 0;
        boolean encontrado = false;
        
        // Ciclo while para recorrer el arreglo
        while (i < numeros.length) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado en la posición (índice): " + i);
                encontrado = true;
                break; // Terminar el ciclo inmediatamente
            }
            i++;
        }
        
        if (!encontrado) {
            System.out.println("El número no se halló en el arreglo.");
        }
        
        scanner.close();
    }
}
