import java.util.Scanner;

public class Ejercicio_5 {
    /*
     * 5. Crea una aplicación que convierta una cantidad de euros introducida por
     * teclado a
     * otra moneda, estas pueden ser a dólares, yenes o libras. El método tendrá
     * como
     * parámetros, la cantidad de euros y la moneda a la que se va a convertir (‘l’
     * a libras,
     * ‘d’ a dólares, ‘y’ a yenes). El método devolverá el valor.
     * Haz un programa en main para probar el método.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de euros que quieres convertir");
        double euros = scanner.nextDouble();

        System.out.println("l. para convertir en libras");
        System.out.println("d. para convertir a dolares");
        System.out.println("y. para convertir a yenes");
        System.out.print("Introduce una opcion: ");
        char opc = scanner.next().charAt(0);

        switch (opc) {
            case 'l':
                System.out.println("Libras: " + aLibras(euros));

                break;
            case 'd':
                System.out.println("Dolares: " + aDolares(euros));

                break;
            case 'y':
                System.out.println("Yenes: " + aYenes(euros));

                break;

            default:
                break;
        }
        scanner.close();
    }

    public static double aLibras(double euro) {
        return euro * 0.88;
    }

    public static double aDolares(double euro) {
        return euro * 1.01;
    }

    public static double aYenes(double euro) {
        return euro * 146.58;
    }
}
