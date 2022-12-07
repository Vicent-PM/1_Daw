package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de un mes");
        int opc = scanner.nextInt();

        scanner.close();

        System.out.println("**Switch**");

        switch (opc) {
            case 1:
            case 2:
            case 3:
                System.out.println("Es invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Es primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Es verano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        System.out.println("**If**");

        if (opc >= 1 && opc <= 3) {
            System.out.println("Es invierno");
        } else if (opc >= 4 && opc <= 6) {
            System.out.println("Es primavera");
        } else if (opc >= 7 && opc <= 9) {
            System.out.println("Es verano");
        } else if (opc >= 10 && opc <= 9) {
            System.out.println("Es otoño");
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}
