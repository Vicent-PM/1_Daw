package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n = scanner.nextInt();

        scanner.close();

        if ( n >= 0 && n <= 9999){
            if ( n < 10 ){
                System.out.println("Tiene 1 cifra");
            }
            else if (n < 100){
                System.out.println("Tiene 2 cifras");
            }
            else if (n < 1000){
                System.out.println("Tiene 3 cifras");
            }
            else{
                System.out.println("Tiene 4 cifras");
            }
        }
        else{
            System.out.println("El numero tiene que estar entre 0 y 9999");
        }
    }
}
