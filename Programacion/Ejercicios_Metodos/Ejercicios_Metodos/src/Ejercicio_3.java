import java.util.Scanner;

public class Ejercicio_3 {
    /*
     * 3. Diseñar un método que tenga como parámetros tres números, y que calcule y
     * devuelva (return) el máximo de ellos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero" + (i + 1));
            numeros[i] = scanner.nextInt();
        }

        System.out.println("El mayor es " + mayorNumero(numeros[0], numeros[1], numeros[2]));

        scanner.close();
    }

    public static int mayorNumero(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else {
            return c;
        }
        
    }
}
