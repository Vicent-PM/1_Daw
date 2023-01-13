package Ejercicios_Variables_Condicionales;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nCigarros;
        boolean fSemana = true;

        System.out.println("Introduce la cantidad de cigarros");
        nCigarros = scanner.nextInt();
        System.out.println("Introduce si es fin de semana o no ( true Si es fin de semana false no es fin de semana");
        fSemana = scanner.nextBoolean();

        scanner.close();

        if ( nCigarros >= 40 && fSemana == true){
            System.out.println("La fiesta ha tenido exito");
        }
        else if (nCigarros >= 40 && nCigarros <=60){
            System.out.println("La fiesta ha tenido exito");
        }
        else{System.out.println("La fiesta no ha tenido exito");}
    }
}
