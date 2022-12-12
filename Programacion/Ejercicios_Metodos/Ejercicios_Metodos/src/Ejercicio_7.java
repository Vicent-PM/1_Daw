import java.util.Scanner;

public class Ejercicio_7 {
    /*
     * 7. Diseñar un método que tenga como parámetros dos enteros y muestra todos
     * los
     * números comprendidos entre ellos, inclusive los dos enteros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        numerosComprendidos(numeros[0], numeros[1]);

        scanner.close();
    }

    public static void numerosComprendidos(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + ", ");
        }
    }
}
