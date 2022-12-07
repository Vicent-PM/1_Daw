public class Ejercicio_2 {
    public static void main(String[] args) {

        int n = 10;
        int l = 0;

        for (int i = 0; i < n + 1; i++) {
            System.out.print("0 ");
        }

        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            System.out.print("0 ");

            for (int j = 0; j < n - 2; j++) {

                if(j == l){
                    System.out.print("0 ");
                }

                System.out.print("* ");

            }
            l += 1;

            System.out.println("0 ");
        }

        for (int i = 0; i < n + 1; i++) {
            System.out.print("0 ");

        }
    }
}
