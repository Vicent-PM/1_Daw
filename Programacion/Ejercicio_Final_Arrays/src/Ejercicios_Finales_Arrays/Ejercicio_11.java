import java.util.Arrays;

public class Ejercicio_11 {
    /*
     * 11. Modificar el algoritmo de la burbuja visto en clase para que en vez de
     * ordenar el array
     * desde la posición 0 a la última, lo haga en la dirección contraria.
     */
    public static void main(String[] args) {
        int[] array = { 5, 8, 3, 4, 1, 10, 4, 0, 7, -3 };

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
