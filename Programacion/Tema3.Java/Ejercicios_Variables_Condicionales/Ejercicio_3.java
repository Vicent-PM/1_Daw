package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int n1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = scanner.nextInt();

        scanner.close();
        
        if (n1 == n2){
            System.out.println("Si son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
}
