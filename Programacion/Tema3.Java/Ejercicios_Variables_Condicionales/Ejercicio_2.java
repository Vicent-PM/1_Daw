package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos hombres hay en el aula");
        int hombres = scanner.nextInt();
        System.out.println("Cuantas mujeres hay en el aula");
        int mujeres = scanner.nextInt();

        scanner.close();

        int porHombre = 100 * hombres / (hombres + mujeres);
        int porMujer = 100 * mujeres / (hombres + mujeres);

        System.out.println("Hay un " + porHombre + "% de hombres y un " + porMujer + "% de mujeres en el aula.");
    }
}
