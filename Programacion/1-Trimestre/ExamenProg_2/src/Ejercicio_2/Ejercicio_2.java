package Ejercicio_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        int array[] = new int[numero];

        array[0] = random.nextInt(1,11);
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(1,11);
            for (int j = 0; j < i; j++) {
                if(array[j] == array[i]){
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
