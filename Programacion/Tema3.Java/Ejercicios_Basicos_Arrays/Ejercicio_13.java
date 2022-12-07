import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posicion " + (i + 1));
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0){
                mediaNegativos = mediaNegativos + array[j];
                contNegativos += 1;
            }
            else if(array[j] > 0){
                mediaPositivos = mediaPositivos + array[j];
                contPositivos += 1;
            }   
        }
        System.out.println("La media de los positivos es " + (mediaPositivos / contPositivos));
        System.out.println("La media de los negativos es " + (mediaNegativos / contNegativos));
    }
}
