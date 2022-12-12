import java.util.Arrays;

public class Ejercicio_10 {
    /*
     * 10. Tenemos un array inicial con estos valores:
     * { 5, 8, 3, 4, 1, 10, 4, 0, 7, -3 }
     * 
     * Si se empieza a ordenar el array por el método de la burbuja, ¿Cuántas
     * vueltas ha dado el
     * algoritmo si al imprimir el array se muestra así? [3, 1, 4, 4, 0, 5, -3, 7,
     * 8, 10]
     */
    public static void main(String[] args) {
        int[] array = { 5, 8, 3, 4, 1, 10, 4, 0, 7, -3 };
        int[] array2 = { 3, 1, 4, 4, 0, 5, -3, 7, 8, 10 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
            if (Arrays.equals(array, array2)) {
                System.out.println("Las vueltas que da son un total de " + (i + 1));
            }
        }
    }
}
