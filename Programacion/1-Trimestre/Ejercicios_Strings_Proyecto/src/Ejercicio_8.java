import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto");
        String texto = scanner.nextLine();

        char[] arrayCaracteres = texto.toCharArray();

        for(int i = 0; i < arrayCaracteres.length; i++){
            if((int) arrayCaracteres[i] % 2 == 0){
                System.out.print(arrayCaracteres[i] + " ");
            }
        }
        scanner.close();
    }
}
