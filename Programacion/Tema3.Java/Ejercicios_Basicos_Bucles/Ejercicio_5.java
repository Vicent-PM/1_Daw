import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n = scanner.nextInt();
        
        scanner.close();

        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
    }
}
