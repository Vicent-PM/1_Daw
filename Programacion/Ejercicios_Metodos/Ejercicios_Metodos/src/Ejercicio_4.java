import java.util.Scanner;

public class Ejercicio_4 {
    /*
     * 4. Crear 4 métodos que recibirán 2 números decimales como parámetros. Cada
     * método realizará una operación: sumar, restar, multiplicar o dividir. Cada
     * método
     * devolverá (return) el resultado.
     * En main, crear un programa en el que se pidan 2 números al usuario y qué
     * operación quiere realizar. Según la operación seleccionada, se llamará a un
     * método
     * u otro.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[2];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Que operacion quieres realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Introduce la opcion: ");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("La suma es: " + sumar(numeros[0], numeros[1]));

                break;
            case 2:
                System.out.println("La resta es: " + restar(numeros[0], numeros[1]));

                break;
            case 3:
                System.out.println("La multiplicacion es: " + multiplicar(numeros[0], numeros[1]));

                break;
            case 4:
                System.out.println("La division es: " + dividir(numeros[0], numeros[1]));

                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (a > b) {
            return a / b;
        } else {
            return -1;
        }
    }
}
