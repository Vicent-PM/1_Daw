package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dado1, dado2, dado3;

        System.out.println("Introduce el resultado del dado 1");
        dado1 = scanner.nextInt();
        System.out.println("Introduce el resultado del dado 2");
        dado2 = scanner.nextInt();
        System.out.println("Introduce el resultado del dado 3");
        dado3 = scanner.nextInt();

        scanner.close();

        if ( dado1 == 6 && dado2 == 6 && dado3 == 6){
            System.out.println("Premio Gordo");
        }
        else if ( (dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)){
            System.out.println("Premio pequeño");
        }
        else if (dado1 == 6 || dado2 == 6 || dado3 == 6){
            System.out.println("Tirada gratuita");
        }
        else{System.out.println("Has perdido");}
    }
}
