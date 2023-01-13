public class Ejercicio_1 {
    public static void main(String[] args) {

        int i = 0;
        System.out.println("While");
        while (i < 10) {
            i++;
            System.out.println(i);
        }

        i = 0;

        System.out.println("Do While");
        do {
            i++;
            System.out.println(i);
        } while (i < 10);

        System.out.println("For");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
