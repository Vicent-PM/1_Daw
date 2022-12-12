import java.util.Arrays;

public class Ejercicio_7 {
    /*
     * Crea dos arrays (A y B) de tamaño 6 y rellénalo con números aleatorios.
     * Después
     * crea un tercero con el doble de tamaño cuyos valores serán: los 3 primeros
     * del A,
     * los de primeros del B, los 3 restantes del A y los 3 restantes del B.
     */
    public static void main(String[] args) {

        int[] A = new int[6];
        int[] B = new int[6];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100) + 1;
            B[i] = (int) (Math.random() * 100) + 1;
        }

        int[] C = new int[12];

        int j = 0;
        int k = 3;

        for (int i = 0; i < 9; i++, k++, j++) {
            if (i == 3) {
                i = 6;
            }
            
            if (k == 6) {
                k = 9;
            }

            C[i] = A[j];
            C[k] = B[j];
        }

        System.out.println(Arrays.toString(C));
    }
}
