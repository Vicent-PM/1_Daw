package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera valoracion");
        double v1 = scanner.nextDouble();
        System.out.println("Introduce la segunda valoracion");
        double v2 = scanner.nextDouble();

        scanner.close();

        if( v1 >= 3.5 && v2 >= 3.5){
            System.out.println("Bar excelente");
        }
        else if( v1 >= 3.5 || v2 >= 3.5){
            System.out.println("Bar bueno");
        }
        else if( (v1 >= 2 && v1 < 3.5) && (v2 >= 2 && v1 < 3.5)){
            System.out.println("Bar regular");
        }
        else{System.out.println("Bar malo");}
        
    }
}
