import java.util.Scanner;


public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int array[] = new int[5];
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el valor de la posicion " + (i + 1));
            array[i] = scanner.nextInt();
        }

        scanner.close();

        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0){
                negativos += 1;
            }
            else if(array[j] > 0){
                positivos += 1;
            }
            else{
                ceros += 1;
            }
        }
        System.out.println("Negativos: " + negativos);
        System.out.println("Positivos: " + positivos);
        System.out.println("Ceros: " + ceros);
    }
}
