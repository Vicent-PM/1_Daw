import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de la posicion " + (i + 1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Introduce el numero a buscar");
        int numero = scanner.nextInt();

        scanner.close();

        boolean numEncontrado = false;

        for(int j = 0; j < array.length; j++){
            if(array[j] == numero){
                System.out.println("El numero " + numero + " se encuentra en el indice " + j);
                numEncontrado = true;
                break;
            }
        }
        if(!numEncontrado){
            System.out.println("El numero no se ha encontrado");
        }
    }
}
