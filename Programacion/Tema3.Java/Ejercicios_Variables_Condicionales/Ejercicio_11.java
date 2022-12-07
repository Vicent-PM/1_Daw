package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        boolean esVerano;

        System.out.println("Introduce la temperatura");
        temperatura = scanner.nextDouble();
        System.out.println("Es fin de semana (true si es, false no es)");
        esVerano = scanner.nextBoolean();

        scanner.close();

        if( esVerano == true && temperatura >= 15 && temperatura <=35){
            System.out.println("Si juegan");
        }
        else if( temperatura >= 15 && temperatura <= 25){
            System.out.println("Si juegan");
        }
        else{System.out.println("No juegan");}
    }
}
