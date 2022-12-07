package Opcionales;

import java.util.Scanner;

public class Ejercicio_3_opc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        double media = 0;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("No se puede introducir este valor");
                i = i - 1;
            } else if (n > 0) {
                media = media + n;
                cont = cont + 1;
            } else {
                suma = suma - n;
            }
        }
        media = media / cont;
        System.out.println("La suma de los negativos es " + suma);
        System.out.println("La media de los positivos es " + media);
        scanner.close();
    }
}
