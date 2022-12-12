package Ejercicio_1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        double[] arrayDouble = {1.7, 2.2, 3.3, 4.5, 5.02};
        char[] arrayChar = {'a', 'b', 'c', 'd', 'e'};
        String[] arrayString = {"Hola", "mundo", "mi", "nombre", "es", "vicente"};

        arrayImp(arrayInt);
        arrayImp(arrayDouble);
        arrayImp(arrayChar);
        arrayImp(arrayString);
    }

    public static void arrayImp(int[] arrayInt) {
        System.out.println(Arrays.toString(arrayInt));
    }

    public static void arrayImp(double[] arrayDouble) {
        System.out.println(Arrays.toString(arrayDouble));
    }

    public static void arrayImp(char[] arrayChar) {
        System.out.println(Arrays.toString(arrayChar));
    }

    public static void arrayImp(String[] arrayString) {
        System.out.println(Arrays.toString(arrayString));
    }
}
