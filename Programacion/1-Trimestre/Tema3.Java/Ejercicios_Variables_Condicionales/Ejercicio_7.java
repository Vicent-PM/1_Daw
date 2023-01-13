package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Introduce el precio del articulo");
        double valorVenta = scanner.nextDouble();
        System.out.println("Introduce el tipo de pago (1 = contado, 2 = tarjeta)");
        int tipoPago = scanner.nextInt();

        double pDescuento;

        if (tipoPago == 1){
            System.out.println("Has elegido pago al contado");
            pDescuento = valorVenta - (valorVenta * 6 / 100);
            System.out.println("El precio del articulo sera " + pDescuento);
        }
        else if (tipoPago == 2){
            System.out.println("Has elegido pago con tarjeta");
            pDescuento = valorVenta - (valorVenta * 3.5 / 100);
            System.out.println("El precio del articulo sera " + pDescuento);
        }
        else{
            System.out.println("EL tipo de pago introducido no es valido");
        }
        scanner.close();
    }
}
