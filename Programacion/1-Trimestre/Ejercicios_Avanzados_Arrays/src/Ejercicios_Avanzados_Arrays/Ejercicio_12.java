public class Ejercicio_12 {
    /*
     * 12. Crear un array bidimensional de tamaño 7x7 y rellenarlo de forma que los
     * elementos
     * de la diagonal principal sean 1 y el resto 0. Imprimir el resultado.
     */

     public static void main(String[] args) {
        int[][] matriz = new int[7][7];

        int i = 0;
        int j = 0;

        while (i < matriz.length && j < matriz[0].length) {
            matriz[i][j] = 1;
            i++;
            j++;
        }

        for (int j2 = 0; j2 < matriz.length; j2++) {
            for (int k = 0; k < matriz[j2].length; k++) {
                System.out.print(matriz[j2][k] + " ");
            }
            System.out.println(" ");
        }
     }
}
