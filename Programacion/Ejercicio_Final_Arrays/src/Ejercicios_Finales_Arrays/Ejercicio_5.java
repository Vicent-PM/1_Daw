public class Ejercicio_5 {
    /*
     * Crear un array bidimensional de 3x6 con los números que desees. Crea otro
     * array de 6x3 y
     * traspón el primero en el segundo.
     * Es decir, si tenemos este de 2x3 {1, 3, 5} debería quedar {1, 2}
     * {2, 4, 6} {3, 4}
     * {5, 6}
     */
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3, 4, 5, 6},
                            {7, 8, 9, 10, 11, 12}, 
                            {13, 14, 15, 16, 17, 18}};
        int[][] matriz2 = new int[6][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("Matriz original");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
