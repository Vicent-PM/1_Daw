import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean esInorrecta = true;
        int intentos = 0;

        do {
            System.out.println("Introduce la contraseña");
            int pass = scanner.nextInt();

            if (pass == 259 || pass == 569 || pass == 352) {
                esInorrecta = false;
                System.out.println("Contraseña correcta");
            } else {
                intentos = intentos + 1;
                if (intentos == 3) {
                    System.out.println("Numero maximo de intentos alcanzado");
                    break;
                }
            }
        } while (esInorrecta);
        scanner.close();
    }
}