public class Ejercicio_1 {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print("0 ");
        }

        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("0 ");

            for (int j = 0; j < n - 2; j++) {
                System.out.print("* ");
            }

            System.out.println("0 ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("0 ");

        }
    }
}
