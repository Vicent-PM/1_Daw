public class Ejercicio_14 {
    /*
     * 14. Crear un array bidimensional de 6x6 y complétalo con los números que tú
     * quieras.
     * Muestra la suma de cada una de las filas.
     */

    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 } };

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + suma);
        }
    }
}
