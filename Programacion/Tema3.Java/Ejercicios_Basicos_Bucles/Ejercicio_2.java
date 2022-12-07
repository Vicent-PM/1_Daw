public class Ejercicio_2 {
    public static void main(String[] args) {

        int i = -10;
        System.out.println("While");
        while (i <= -1) {
            System.out.println(i);
            i++;
        }

        i = -10;

        System.out.println("Do While");
        do {
            System.out.println(i);
            i++;
        } while (i <= -1);

        System.out.println("For");
        for (i = -10; i <= -1; i++) {
            System.out.println(i);
        }

    }
}
