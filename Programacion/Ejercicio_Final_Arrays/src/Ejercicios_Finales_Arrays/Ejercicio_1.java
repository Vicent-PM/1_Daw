public class Ejercicio_1 {
    /*
     * 1. Crear un programa que simule 100 tiradas de un dado. Se deberá almacenar
     * en un array
     * las veces que aparece cada cara del dado. Por último, imprimir cuántas veces
     * ha
     * aparecido cada cara del dado.
     */
    public static void main(String[] args) {
        int[] tiradas = new int[100];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        for (int i = 0; i < tiradas.length; i++) {
            tiradas[i] = (int) (Math.random() * 6) + 1;
        }

        for (int i = 0; i < tiradas.length; i++) {
            if (tiradas[i] == 1) {
                num1++;
            } else if (tiradas[i] == 2) {
                num2++;
            } else if (tiradas[i] == 3) {
                num3++;
            } else if (tiradas[i] == 4) {
                num4++;
            } else if (tiradas[i] == 5) {
                num5++;
            } else {
                num6++;
            }
        }

        System.out.println("El numero 1 ha aparecido " + num1 + " veces.");
        System.out.println("El numero 2 ha aparecido " + num2 + " veces.");
        System.out.println("El numero 3 ha aparecido " + num3 + " veces.");
        System.out.println("El numero 4 ha aparecido " + num4 + " veces.");
        System.out.println("El numero 5 ha aparecido " + num5 + " veces.");
        System.out.println("El numero 6 ha aparecido " + num6 + " veces.");
    }
}
