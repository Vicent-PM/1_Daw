package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un DNI sin la letra");
        int dni = scanner.nextInt();

        scanner.close();

        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = dni % 23;
        System.out.println("El dni es " + dni + letra[resto]);

    }
}
