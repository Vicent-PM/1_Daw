package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n = scanner.nextInt();

        scanner.close();

        if (n % 10 == 0){
            System.out.println("Si es multiplo de 10");
        }
        else{
            System.out.println("No es multiplo de 10");
        }
    }
}
