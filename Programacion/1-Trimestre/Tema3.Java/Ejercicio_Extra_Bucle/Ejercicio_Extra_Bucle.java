import java.util.Scanner;

public class Ejercicio_Extra_Bucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        scanner.close();

        int i;
        int numeroOriginal = numero;

        // Sacar cantidad de digitos
        System.out.println("Cantidad de digitos");
        int digitos = 0;
        while (numeroOriginal != 0) {
            numeroOriginal = numeroOriginal / 10;
            digitos++;
        }
        System.out.println(numero + " tiene " + digitos + " digitos");

        // Sacar suma de digitos
        System.out.println("Suma de digitos");
        numeroOriginal = numero;
        int sumaDigitos = 0;
        while (numeroOriginal > 0) {
            sumaDigitos = (numeroOriginal % 10) + sumaDigitos;
            numeroOriginal = numeroOriginal / 10;
        }
        System.out.println(sumaDigitos);

        // Sacar producto de los digitos
        System.out.println("Producto de sus digitos");
        numeroOriginal = numero;
        int productoDigitos = 1;
        while (numeroOriginal > 0) {
            productoDigitos = (numeroOriginal % 10) * productoDigitos;
            numeroOriginal = numeroOriginal / 10;
        }
        System.out.println(productoDigitos);

        // Sacar digito izquierdo
        System.out.println("Digito izquierdo");
        numeroOriginal = numero;
        while (numeroOriginal > 9) {
            numeroOriginal = numeroOriginal / 10;
            if (numeroOriginal < 10) {
                break;
            }
        }
        System.out.println(numeroOriginal);

        // Sacar digito derecho
        System.out.println("Digito derecho");
        numeroOriginal = numero;
        int digitoDerecho = 0;
        for (i = 0; i <= 1; i++) {
            digitoDerecho = numeroOriginal % 10;
        }
        System.out.println(digitoDerecho);

        // Sacar digito menor
        System.out.println("Digito menor");
        int menor = numero;

        while (numeroOriginal != 0) {
            int numeroMod = numeroOriginal % 10;
            numeroOriginal = numeroOriginal / 10;
            if (numeroMod < menor) {
                menor = numeroMod;
            }
        }
        System.out.println(menor);

        // Sacar digito mayor
        System.out.println("Digito mayor");
        numeroOriginal = numero;

        int mayor = 0;
        while (numeroOriginal != 0) {
            int numeroMod = numeroOriginal % 10;
            numeroOriginal = numeroOriginal / 10;
            if (numeroMod > mayor) {
                mayor = numeroMod;
            }
        }
        System.out.println(mayor);

        // Sacar numero invertido
        System.out.println("Numero invertido");
        numeroOriginal = numero;

        while (numeroOriginal != 0) {
            int numeroMod = numeroOriginal % 10;
            numeroOriginal = numeroOriginal / 10;
            System.out.print(numeroMod);
        }
    }
}
