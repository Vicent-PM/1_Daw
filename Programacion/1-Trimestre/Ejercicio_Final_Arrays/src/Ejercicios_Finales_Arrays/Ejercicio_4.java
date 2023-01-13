import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4 {
    /*
     * Crear un array de 10 elementos. Leer a través del teclado 9 números y
     * asignarlos al array.
     * Para el último número se pedirá por teclado un número y una posición del 1 al
     * 10. Se
     * tendrá que insertar el número en la posición indicada, desplazando al resto
     * de números a
     * la posición siguiente si fuese necesario.
     * Por ejemplo, tenemos el array {1,2,3,4,5,6,7,8,9}. El usuario introduce el
     * número 10 en la
     * posición 5, por lo que el array quedaría {1, 2, 3, 4, 10, 5, 6, 7, 8, 9}.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int[] arrayAux = new int[10];

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("Introduce una posicion");
        int posicion = scanner.nextInt();

        for (int i = 0; i < arrayAux.length; i++) {
            arrayAux[i] = array[i];
        }

        for (int i = posicion - 1; i < array.length; i++) {
            array[i] = arrayAux[i - 1];
        }
        array[posicion - 1] = numero;
        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
