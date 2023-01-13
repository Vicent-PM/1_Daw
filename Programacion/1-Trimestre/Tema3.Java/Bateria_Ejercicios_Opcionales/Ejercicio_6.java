import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionSwitch = 1;
        while (opcionSwitch != 7) {
            System.out.println();
            System.out.println("*-*-*-*-*-*-*-Menu-*-*-*-*-*-*-*");
            System.out.println("1. Calcular el factorial de un número entero positivo");
            System.out.println("2. Imprimir los factoriales de los números desde 1 hasta un número n introducido por el usuario");
            System.out.println("3. Decir si un número es primo o no");
            System.out.println("4. Imprimir los números primos desde 1 hasta un número n introducido por el usuario");
            System.out.println("5. Mostrar la serie de fibonacci hasta el número indicado por el usuario");
            System.out.println("6. Imprimir ‘X’ letras del abecedario");
            System.out.println("7. Salir");
            System.out.print("Introduce una opcion: ");
            opcionSwitch = scanner.nextInt();
            System.out.println();

            switch (opcionSwitch) {
                case 1:
                    calcularFactorial();
                    break;
                case 2:
                    imprimirFactoriales();
                    break;
                case 3:
                    esPrimo();
                    break;
                case 4:
                    imprimirPrimo();
                    break;
                case 5:
                    serieFibonacci();
                    break;
                case 6:
                    imprimirAbecedario();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        scanner.close();
    }

    public static void calcularFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero para hacer el factorial");
        int numero = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        scanner.close();
    }

    public static void imprimirFactoriales() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero para hacer el factorial");
        int numero = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            System.out.print(factorial + " ");
        }
        scanner.close();
    }

    public static void esPrimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador += 1;
            }
        }

        if (contador == 2) {
            System.out.println("Si es primo");
        } else {
            System.out.println("No es primo");
        }
        scanner.close();
    }

    public static void imprimirPrimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            int contador = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contador += 1;
                }
            }
            if (contador == 2) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static void serieFibonacci() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        int n = 0;
        int n2 = 1;
        int intercambio = 1;

        for (int i = 1; i <= numero; i++) {
            System.out.print(intercambio + " ");
            intercambio = n + n2;
            n = n2;
            n2 = intercambio;
        }
        scanner.close();
    }

    public static void imprimirAbecedario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        int ascii = 65;

        for (int x = ascii; x <= ascii + numero; x++) {
            for (int i = ascii; i <= x - 1; i++) {
                System.out.print((char) i);
            }
            System.out.println("");
        }
        scanner.close();
    }
}
