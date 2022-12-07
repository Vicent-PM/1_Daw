import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String texto = scanner.nextLine();
        System.out.println("Introduce el caracter a buscar");
        char caracter = scanner.next().charAt(0);

        int contCaracter = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contCaracter += 1;
            }
        }

        System.out.println("El caracter " + caracter + " aparece " + contCaracter + " veces.");
        scanner.close();
    }
}
