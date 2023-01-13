public class Ejercicio_10 {
    /*
     * Escribir un programa que calcule el determinante de una matriz de 3x3.
     * Pruébelo
     * con la matriz {{1,2,3}, {4,5,6}, {7,8,8}} cuyo determinante es 3.
     */
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 8 } };

        int determinante = matriz[0][0] * matriz[1][1] * matriz[2][2] + matriz[0][1] * matriz[1][2] * matriz[2][0]
                + matriz[0][2] * matriz[1][0] * matriz[2][1] - matriz[0][0] * matriz[1][2] * matriz[2][1]
                - matriz[0][1] * matriz[1][0] * matriz[2][2] - matriz[0][2] * matriz[1][1]
                * matriz[2][0];

        System.out.println(determinante);
    }
}
