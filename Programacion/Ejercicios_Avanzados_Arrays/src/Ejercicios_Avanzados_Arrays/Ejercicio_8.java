import java.util.Scanner;

public class Ejercicio_8 {
    /*
     * Escribir un programa en el que se pide un número al usuario y se crea un
     * array de
     * enteros con este tamaño. A continuación, se rellena el array con valores
     * indicados
     * por el usuario.
     * Finalmente, se deberá recorrer el array e imprimir en una misma línea tantos
     * asteriscos como indique el valor de cada elemento del array.
     * Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:
     *****
     ****
     ***
     **
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array");
        int numero = scanner.nextInt();

        int[] array = new int[numero];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un el valor para la posicion " + i);
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
