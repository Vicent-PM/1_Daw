import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu pais");
        String pais = scanner.nextLine();

        pais = pais.toUpperCase();

        System.out.println(nombre + "-" + pais.substring(0, 2));
       
        scanner.close();
    }
}
