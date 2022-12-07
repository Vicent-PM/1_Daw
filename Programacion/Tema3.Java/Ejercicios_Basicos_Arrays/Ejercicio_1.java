public class Ejercicio_1 {
    public static void main(String[] args) {
        int arrayNum[] = new int[10];

        arrayNum[0] = 1;
        arrayNum[3] = 4;
        arrayNum[8] = 9;
        arrayNum[9] = 10;

        System.out.println(arrayNum[0]);
        System.out.println(arrayNum[3]);
        System.out.println(arrayNum[8]);
        System.out.println(arrayNum[9]);
        System.out.println("EL array tiene una longitud de " + arrayNum.length);
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayNum[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }
}
