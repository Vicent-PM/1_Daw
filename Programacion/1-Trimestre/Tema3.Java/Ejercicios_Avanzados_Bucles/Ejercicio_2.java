import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esInorrecta = true;
        do {
            System.out.println("Introduce la contraseña");
            int pass = scanner.nextInt();

            if(pass == 259 || pass == 569 || pass == 352){
                esInorrecta = false;
                System.out.println("Contraseña correcta");
            }
        } while (esInorrecta);

        scanner.close();
    }
}
