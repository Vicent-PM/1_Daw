import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la x");
        int x = scanner.nextInt();
        System.out.println("Introduce la Y");
        int y = scanner.nextInt();
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}