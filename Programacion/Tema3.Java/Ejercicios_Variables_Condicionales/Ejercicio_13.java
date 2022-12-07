package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Menu***");
        System.out.println("1. Sopa de tiburon");
        System.out.println("2. Arroz 3 delicias");
        System.out.println("3. Cerdo agridulce");
        System.out.println("4. Pollo con almendras");
        System.out.println("5. Pato a la pekinesa");
        System.out.println("Elige una opcion");
        int opc = scanner.nextInt();

        scanner.close();

        switch(opc){
            case 1:
                System.out.println("Has elegido el plato de Sopa de tiburon");
                break;
            case 2:
                System.out.println("Has elegido el plato de Arroz 3 delicias");
                break;
            case 3:
                System.out.println("Has elegido el plato de Cerdo agridulce");
                break;
            case 4:
                System.out.println("Has elegido el plato de Pollo con almendras");
                break;
            case 5:
                System.out.println("Has elegido el plato de Pato a la pekinesa");
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
            
    }
}
