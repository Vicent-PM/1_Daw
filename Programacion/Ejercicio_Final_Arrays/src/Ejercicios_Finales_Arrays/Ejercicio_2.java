import java.util.Scanner;

public class Ejercicio_2 {
    /*
     * 2. Desarrollar un programa en el que se crea un array con números
     * introducidos por teclado.
     * Indicar si el número es capicúa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cuantos digitos va a tener el numero");
        int tamaño = scanner.nextInt();

        int[] numeros = new int[tamaño];
        int digitos = 0;

        boolean esCapicua = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            numeros[i] = scanner.nextInt();
        }

        for (int j = 0; j < numeros.length; j++) {
            if(numeros[j] == numeros[(numeros.length - j) - 1]){
                esCapicua = true;
            } else{
                esCapicua = false;
            }
        }

        if(esCapicua){
            System.out.println("El numero si es capicua");
        } else{
            System.out.println("El numero no es capicua");
        }
        scanner.close();
    }
}
