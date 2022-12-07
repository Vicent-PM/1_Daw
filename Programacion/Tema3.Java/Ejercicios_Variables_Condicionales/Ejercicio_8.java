package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la temperatura");
        int temperatura = scanner.nextInt();

        scanner.close();
        
        if (temperatura >= 40){
            System.out.println("Se pueden hacer tostadas al sol");
        }
        else if (temperatura <= 30 && temperatura >=40){
            System.out.println("Oju, que calor!!!");
        }
        else if (temperatura <= 20 && temperatura > 30){
            System.out.println("¡Que agustito se esta aqui!");
        }
        else if (temperatura <= 10 && temperatura > 20){
            System.out.println("Hace rasquilla");
        }
        else if (temperatura <= 0 && temperatura > 10){
            System.out.println("HAce un frio que pela");
        }
        else if (temperatura <= -20 && temperatura > 0){
            System.out.println("Se pueden ver pinguinos por la calle");
        }
        else{
            System.out.println("Ve sacando el vodka");
        }

    }
}
