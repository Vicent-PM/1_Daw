import java.util.Random;

public class Ejercicio_7 {
    public static void main(String[] args) {

        int numero = 17;
        boolean noEsCorrecto = true;

        while (noEsCorrecto) {
            Random random = new Random();
            int n = random.nextInt(20);
            System.out.println(n);
            if (n == numero) {
                System.out.println("Numero correcto");
                noEsCorrecto = false;
                break;
            } else if (n < numero) {
                System.out.println("El numero que has introducido es mas pequeño");
            } else {
                System.out.println("El numero que has introducido es mas grande");
            }
        }
    }
}
