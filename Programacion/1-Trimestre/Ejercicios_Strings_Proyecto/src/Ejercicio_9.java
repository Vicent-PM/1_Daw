import java.util.Scanner;


public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto");
        String texto = scanner.nextLine();
        System.out.println("Introduce la palabra a comprobar");
        String palabra = scanner.nextLine();

        String ultimas3 = texto.substring(texto.length() - 3);

        boolean rima = palabra.endsWith(ultimas3);

        if(rima){
            System.out.println("Si rima");
        }
        else{
            System.out.println("No rima");
        }
        scanner.close();
    }
}
