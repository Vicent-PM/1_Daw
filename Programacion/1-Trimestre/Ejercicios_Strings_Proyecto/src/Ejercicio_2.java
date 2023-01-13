import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esInorrecta = true;
        do {
            System.out.println("Introduce la contraseña");
            String pass = scanner.nextLine();

            if(pass.equals("qwer") || pass.equals("asdf")|| pass.equals("password")){
                esInorrecta = false;
                System.out.println("Contraseña correcta");
            }
        } while (esInorrecta);

        scanner.close();
    }
}
