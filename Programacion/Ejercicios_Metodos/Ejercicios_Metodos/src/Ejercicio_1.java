import java.util.Scanner;

public class Ejercicio_1 {
    /*
     * 1. Realizar un método, al que se le pasa como parámetro un número entero N.
     * El
     * método no devolverá ningún valor (void). Su función será repetir por pantalla
     * N
     * veces, el mensaje: “Módulo ejecutándose”.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int N = scanner.nextInt();

        imprimirMensaje(N);

        scanner.close();
    }

    public static void imprimirMensaje(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Modulo ejecutandose");
        }
    }
}
