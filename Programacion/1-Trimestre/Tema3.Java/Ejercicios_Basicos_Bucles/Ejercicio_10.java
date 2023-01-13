import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while(n>=0){
            System.out.println("Introduce un numero");
            n = scanner.nextInt();
            System.out.println("El cuadrado de " + n + " es " + (int) Math.pow(n, 2));
        }

        scanner.close();
    }
}
