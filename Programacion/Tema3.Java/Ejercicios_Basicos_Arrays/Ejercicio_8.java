import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array");
        int tamaño = scanner.nextInt();

        int arrayNum[] = new int[tamaño];
        
        // Rellenando el array
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce el valor de la posicion " + (i + 1));
            arrayNum[i] = scanner.nextInt();
        }
        // Imprimiendo los valores
        for (int j = 1; j < tamaño - 1; j++) {
            System.out.println(arrayNum[j] + " ");
        }
        //Imprimiendo valores primera y ultima posicion
        System.out.println("Valor primera posicion " + arrayNum[0]);
        System.out.println("Valor ultima posicion " + arrayNum[tamaño - 1]);

        scanner.close();
    }
}
