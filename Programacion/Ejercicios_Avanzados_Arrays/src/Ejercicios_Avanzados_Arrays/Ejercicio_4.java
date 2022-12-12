import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4 {
    /*
     * Crea dos arrays (A y B) de tamaño 5 y rellénalo con números introducidos por
     * el
     * usuario. Después crea un tercero con el doble de tamaño cuyos valores serán:
     * el 1o
     * de A, el 1o de B, el 2o de A, el 2o de B, etc.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];


        //Rellenar arrays
        for (int i = 0; i < A.length; i++) {
            System.out.println("Introduce un valor para el array A, posicion " + i);
            A[i] = scanner.nextInt();
            System.out.println("Introduce un valor para el array B, posicion " + i);
            B[i] = scanner.nextInt();
        }

        int[] C = new int[10];
        int j = 0;
        for (int i = 0; i < C.length; i = i + 2) {
            C[i] = A[j];
            C[i + 1] = B[j];
            j++;
        }

        System.out.println(Arrays.toString(C));
        scanner.close();
    }
}
