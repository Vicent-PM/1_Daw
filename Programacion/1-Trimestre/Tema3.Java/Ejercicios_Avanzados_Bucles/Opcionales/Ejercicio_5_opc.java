package Opcionales;

import java.util.Scanner;

public class Ejercicio_5_opc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año");
        int año1 = scanner.nextInt();
        System.out.println("Introduce el segundo año");
        int año2 = scanner.nextInt();

        for (int i = año1; i <= año2; i++) {
            if (i % 4 != 0) {
                System.out.println(i);
            }

        }
        scanner.close();
    }
}
