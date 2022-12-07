public class Ejercicio_3 {
    public static void main(String[] args) {
        int arrayNum[] = new int[5];
        int arrayInverso[] = new int[5];

        for(int i = 0; i < arrayNum.length; i++){
            arrayNum[i] = i + 1;
            arrayInverso[(arrayNum.length - i) - 1] = i + 1;
        }

        for(int i = 0; i < arrayNum.length; i++){
            System.out.print(arrayNum[i] + " ");
            System.out.println(arrayInverso[i] + " ");
        }

    }
}
