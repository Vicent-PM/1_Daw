package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 1000, opc = 0, operacion;

        while (opc != 4) {
            System.out.println("1. Sacar dinero");
            System.out.println("2. Meter dinero");
            System.out.println("3. Indicar saldo");
            System.out.println("4. Salir");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Cuanto dinero quieres sacar");
                    operacion = scanner.nextInt();

                    if (saldoInicial >= operacion) {
                        saldoInicial = saldoInicial - operacion;
                        System.out.println(
                                "Has sacado " + operacion + "€");
                    } else if (saldoInicial < operacion) {
                        System.out.println("No hay suficiente dinero en la cuenta.");
                    }
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea ingresar");
                    operacion = scanner.nextInt();
                    saldoInicial = saldoInicial + operacion;
                    System.out.println("Has ingresado correctamente " + operacion + "€");
                    break;
                case 3:
                    System.out.println("Tiene " + saldoInicial + "€ en la cuenta.");
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        scanner.close();
    }
}
