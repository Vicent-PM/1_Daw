package Opcionales;

import java.util.Scanner;

public class Ejercicio_2_opc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        System.out.println("Sus divisores son");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
