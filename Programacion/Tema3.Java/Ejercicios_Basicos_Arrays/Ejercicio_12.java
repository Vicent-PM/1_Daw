import java.util.Arrays;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int array2[] = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10) + 1;
            if (array1[i] % 2 == 0) {
                array2[i] = array1[i];
            }
        }

        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 0) {
                System.out.print(array2[i] + " ");
            }
        }

    }
}
