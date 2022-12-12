import java.util.Scanner;

public class Ejercicio_11 {
    /*
     * 11. Escribe un programa que dada una matriz de 3x3 haga lo siguiente:
     * a. Calcule la media de todos los valores
     * b. Calcule el valor mínimo y el máximo de todos los valores
     * c. Sumar los valores en la diagonal descendente.
     * d. Sumar los valores en la diagonal ascendente.
     * e. Sumar los valores que están por encima de la diagonal descendente.
     * f. Sumar los valores que están por debajo de la diagonal descendente.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int x = matriz.length;
        int y = matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce valor para [" + i + "][" + j + "]");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("a. Calcule la media de todos los valores");
        System.out.println("b. Calcule el valor mínimo y el máximo de todos los valores");
        System.out.println("c. Sumar los valores en la diagonal descendente.");
        System.out.println("d. Sumar los valores en la diagonal ascendente.");
        System.out.println("e. Sumar los valores que están por encima de la diagonal descendente.");
        System.out.println("f. Sumar los valores que están por debajo de la diagonal descendente.");
        System.out.print("Elige una opcion: ");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case 'a':
                int media = 0;

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        media += matriz[i][j];
                    }
                }

                media = media / (x * y);
                System.out.println("La media es " + media);
                break;
            case 'b':
                int valorMax = 0;
                int valorMin = 999999999;

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (matriz[i][j] < valorMin) {
                            valorMin = matriz[i][j];
                        }
                        if (matriz[i][j] > valorMax) {
                            valorMax = matriz[i][j];
                        }
                    }
                }

                System.out.println("EL valor maximo es " + valorMax);
                System.out.println("El valor minimo es " + valorMin);
                break;
            case 'c':
                int suma = 0;
                int i = 0;
                int j = 0;

                while (i < matriz.length && j < matriz[0].length) {
                    suma += matriz[i][j];
                    i++;
                    j++;
                }
                System.out.println("La suma de la diagonal descendente es: " + suma);
                break;
            case 'd':
                suma = 0;
                i = 0;
                j = matriz.length - 1;

                while (i < matriz.length && j >= 0) {
                    suma += matriz[i][j];
                    i++;
                    j--;
                }
                System.out.println("La suma de la diagonal ascendente es: " + suma);
                break;
            case 'e':
                suma = 0;
                i = 0;
                j = 0;

                while (i < matriz.length && j < matriz[0].length) {
                    j++;
                    suma += matriz[i][j];
                    if (j == 2) {
                        i++;
                        suma += matriz[i][j];
                        break;
                    }
                }
                System.out.println("La suma de los valores encima de la diagonal descendente es: " + suma);
                break;
            case 'f':
                suma = 0;
                i = 0;
                j = 0;

                while (i < matriz.length && j < matriz[0].length) {
                    i++;
                    suma += matriz[i][j];
                    if (i == 2) {
                        j++;
                        suma += matriz[i][j];
                        break;
                    }
                }
                System.out.println("La suma de los valores debajo de la diagonal descendente es: " + suma);
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.close();
    }
}
