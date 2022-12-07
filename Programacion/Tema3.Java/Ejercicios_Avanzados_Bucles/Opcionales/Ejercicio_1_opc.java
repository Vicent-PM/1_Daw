package Opcionales;

import java.util.Random;

public class Ejercicio_1_opc {
    public static void main(String[] args) {

        int numero = 17;
        boolean esCorrecto = true;
        int intentos = 0;

        while (esCorrecto) {
            Random random = new Random();
            int n = random.nextInt(20);
            intentos = intentos + 1;
            if (intentos > 10) {
                System.out.println("Numero maximo de intentos alcanzados");
                break;
            }
            System.out.println(n);
            if (n == numero) {
                System.out.println("Numero correcto");
                esCorrecto = false;
                break;
            } else if (n < numero) {
                System.out.println("El numero que has introducido es mas pequeño");
            } else {
                System.out.println("El numero que has introducido es mas grande");
            }
        }
    }
}
