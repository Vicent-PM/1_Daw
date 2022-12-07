import java.util.Scanner;

public class Ejercicio_4 {
    /*
     * Realiza un programa que pida 10 números al usuario. Tras esto, el programa
     * debe indicar cuántos números pares, cuántos impares y cuántos ceros se han
     * introducido.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        int pares = 0;
        int impares = 0;
        int ceros = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero para la posicion " + (i + 1));
            array[i] = scanner.nextInt();

            if (array[i] == 0) {
                ceros++;
            } else if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Ceros: " + ceros);

        scanner.close();
    }
}
