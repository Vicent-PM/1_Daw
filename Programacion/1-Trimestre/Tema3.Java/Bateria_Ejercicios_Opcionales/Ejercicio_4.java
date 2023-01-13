import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, numeroAux; 
        int numeroInverso = 0;
        do {
            System.out.println("Introduce un numero mayor o igual a 10");                                                 
            numero = scanner.nextInt();
        } while (numero < 10);

        scanner.close();
        numeroAux = numero;
        while(numeroAux != 0){
            int cifra = numeroAux % 10;
            numeroInverso = numeroInverso * 10 + cifra;
            numeroAux = numeroAux / 10;
        }
        if(numero == numeroInverso){
            System.out.println("Si es capicua");
        }
        else{
            System.out.println("No es capicua");
        }
    }
}
