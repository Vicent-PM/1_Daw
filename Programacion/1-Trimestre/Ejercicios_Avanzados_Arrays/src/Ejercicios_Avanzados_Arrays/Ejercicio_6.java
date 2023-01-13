import java.util.Scanner;

public class Ejercicio_6 {
    /*
     * 6. Programa para leer la altura en metros de N personas y calcular la altura
     * media:
     * a. Primero se pedirá el número de personas por teclado y el tamaño del array
     * será ese.
     * b. Después, se llenará el array con la altura de las personas leída también
     * por
     * teclado. La altura será en metros
     * c. A continuación, calculamos la altura media.
     * d. Después, diremos cuántas personas tienen una altura superior a la media y
     * cuántas están por debajo de la media.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de personas");
        int personas = scanner.nextInt();

        double[] altura = new double[personas];

        for (int i = 0; i < altura.length; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1));
            altura[i] = scanner.nextDouble();
        }

        double alturaMedia = 0;

        for (int i = 0; i < altura.length; i++) {
            alturaMedia += altura[i];
        }

        alturaMedia = alturaMedia / personas;
        int superior = 0;
        int inferior = 0;

        for (int i = 0; i < altura.length; i++) {
            if(altura[i] < alturaMedia){
                inferior++;
            } else {
                superior++;
            }
        }

        System.out.println("La media es: " + alturaMedia);
        System.out.println("Las personas que tienen altura superior a la media son: " + superior);
        System.out.println("Las personas que tienen altura inferior a la media son: " + inferior);

        scanner.close();
    }
}
