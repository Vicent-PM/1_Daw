import java.util.Scanner;

public class Ejercicio_6 {
    /*
     * 6. Realizar un método al que se le pasan dos parámetros ‘a’ y ‘n’ que serán
     * la base y el
     * exponente. Debe calcular y devolver la base elevada al exponente (a
     * n
     * ) haciendo uso
     * 
     * de un bucle
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el exponente");
        int a = scanner.nextInt();
        System.out.println("Introduce la base");
        int n = scanner.nextInt();

        System.out.println("EL resultado es: " + elevadoA(a, n));

        scanner.close();
    }

    public static int elevadoA(int a, int n) {
        int aux = 1;
        for (int i = 1; i <= n; i++) {
            aux *= a;
        }
        return aux;
    }
}
