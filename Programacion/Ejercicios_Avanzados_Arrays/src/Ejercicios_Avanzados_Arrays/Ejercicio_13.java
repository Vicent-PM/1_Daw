public class Ejercicio_13 {
    /*
     * Crea un array bidimensional de 6x6 y rellénalo de forma que los elementos que
     * queden al borde sean 1 y el resto sea 0
     */

    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        // Rellenar borde arriba
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        // Rellenar bordes izquierdo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
                j = matriz[i].length;
            }
        }

        // Rellenar matriz borde derecho
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        // Rellenar borde abajo
        for (int i = matriz.length - 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1;
            }
        }

        // Imprimir
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
