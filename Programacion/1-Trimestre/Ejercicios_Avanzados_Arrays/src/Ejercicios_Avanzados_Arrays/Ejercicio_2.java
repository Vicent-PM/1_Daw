import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] ArrayBi = new double[4][3];
        double[] media = new double[4];

        for (int i = 0; i < ArrayBi.length; i++) {
            for (int j = 0; j < ArrayBi[i].length; j++) {
                System.out.println("Introduce la nota del alumno " + (i + 1) + " del trimestre " + (j + 1));
                ArrayBi[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < ArrayBi.length; i++) {
            for (int j = 0; j < ArrayBi[i].length; j++) {
                media[i] = media[i] + ArrayBi[i][j];
            }
            media[i] = media[i] / 3;
            System.out.println("La nota media del alumno " + (i + 1) + " es " + media[i]);
        }
        scanner.close();
    }
}
