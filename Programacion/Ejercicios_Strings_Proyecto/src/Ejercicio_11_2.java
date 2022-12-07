import java.util.Scanner;

public class Ejercicio_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String texto = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Vuelta de bucle numero " + (i + 1));
            texto = texto.replace('a', 'u').replace('e', 'i').replace('o', 'a').replace('u', 'e').replace('i', 'o');
            System.out.println(texto);
        }

        scanner.close();
    }
}
