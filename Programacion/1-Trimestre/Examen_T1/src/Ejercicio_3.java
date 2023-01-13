import java.util.Arrays;

public class Ejercicio_3 {
    /*
     * Dado un array de números de 5 posiciones con los siguiente valores
     * {1,2,3,4,5}, guardar los valores de este array en otro array distinto pero
     * con los valores invertidos, es decir, que el segundo array debera tener los
     * valores {5,4,3,2,1}. Es obligatorio el uso de un bucle.
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] arrayInvertido = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[array.length - i - 1] = array[i];
        }


        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));

    }
}
