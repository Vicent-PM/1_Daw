import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una nueva contraseña para su cuenta");
        String password = scanner.nextLine();

        if(password.length() > 8 || password.length() < 8){
            System.out.println("La contraseña tiene que tener 8 caracteres");
        }
        else{
            System.out.println("Contraseña valida");
        }
        scanner.close();
    }
}
