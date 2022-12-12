import java.util.Scanner;

public class Ejercicio_2 {
    /*
     * 2. Diseñar un método que muestre en pantalla el doble del valor de un número
     * que se
     * le pasa como parámetro. El método no devolverá ningún valor (void), imprime
     * el
     * resultado directamente por pantalla.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int N = scanner.nextInt();

        dobleNumero(N);

        scanner.close();
    }

    public static void dobleNumero(int N) {
        System.out.println("El doble es: " + (N * 2));
    }
}
