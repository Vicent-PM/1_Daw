import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto");
        String texto = scanner.nextLine();

        int contVocales = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
                    || texto.charAt(i) == 'u') {
                contVocales += 1;
            }
        }
        texto = texto.replace('e', 'a').replace('i', 'a').replace('o', 'a').replace('u', 'a');
        System.out.println("Vocales: " + contVocales);
        System.out.println("La cadena con las vocales reemplazadas es: " + texto);

        scanner.close();
    }
}
