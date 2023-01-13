public class Ejercicio_2 {
    /* Transforma este bucle for en su equivalente bucle while. */
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        while (a < 7) {
            System.out.println("Nueva vuelta");
            System.out.println(a);
            System.out.println(b);
            a++;
            b += 2;
        }
    }
}
