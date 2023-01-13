public class Ejercicio_9 {
    /*
     * Crear una matriz de enteros de 2x3 con los valores que tú quieras e
     * imprimirla.
     */
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
