import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = 0;
        int cont = 0;
        double suma = 0;
        double media = 0;

        while (n >= 0) {
            System.out.println("Introduce un numero");
            n = scanner.nextDouble();

            if (n >= 0) {
                cont = cont + 1;
                suma = n + suma;
            } else {
                break;
            }
        }
        media = suma / cont;
        System.out.println("La media es " + media);
        scanner.close();
    }
}