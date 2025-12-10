public class ContadorVocales {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo de 10 caracteres
        char[] letras = { 'a', 'b', 'e', 'c', 'i', 'd', 'o', 'f', 'u', 'g' };
        int contadorVocales = 0;

        System.out.println("Arreglo de letras:");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();

        // Recorrer el arreglo y contar vocales
        for (int i = 0; i < letras.length; i++) {
            char letra = letras[i];
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Total de vocales encontradas: " + contadorVocales);
    }
}
//