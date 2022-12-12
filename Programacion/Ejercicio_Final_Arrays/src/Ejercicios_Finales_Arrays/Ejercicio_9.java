import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_9 {
    /*
     * 9. Realizar un programa que lea los tiempos en los que 10 corredores han
     * acabado una
     * carrera. El programa debe determinar qué corredores tienen el primer, segundo
     * y último
     * puesto, así como cuál es el tiempo medio en que se ha corrido la carrera.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tiempos = new int[10];
        int[] tiemposOrd = new int[10];

        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Introduce el tiempo del corredor " + (i + 1));
            tiempos[i] = scanner.nextInt();
        }

        for (int i = 0; i < tiempos.length; i++) {
            tiemposOrd[i] = tiempos[i];
        }

        for (int i = 0; i < tiemposOrd.length; i++) {
            for (int j = 0; j < tiemposOrd.length - i - 1; j++) {
                if (tiemposOrd[j] > tiemposOrd[j + 1]) {
                    int aux = tiemposOrd[j];
                    tiemposOrd[j] = tiemposOrd[j + 1];
                    tiemposOrd[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(tiemposOrd));

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < tiemposOrd.length; j++) {
                if(tiempos[j] == tiemposOrd[i]){
                    System.out.println("En la posicion " + (i+1) + " a quedado el corredor " + (j + 1));
                }
            }
        }
        scanner.close();
    }
}
