import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
    
            System.out.println("En que numero quieres terminar el bucle");
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i += 7) {
                System.out.println(i);
            }
            scanner.close();
    }
}
