import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto 1");
        String texto1 = scanner.nextLine();

        texto1 = texto1.toLowerCase();

        int posIni = 0;
        int posFin = texto1.length() - 1;

        boolean esPalindromo = true;

        while(posIni < posFin){
            if(texto1.charAt(posIni) != texto1.charAt(posFin)){
                esPalindromo = false;
            }
            posIni++;
            posFin--;
        }
        if(esPalindromo){
            System.out.println("El texto si es palindromo");
        }
        else{
            System.out.println("El texto no es palindromo");
        }
        scanner.close();
    }
}
