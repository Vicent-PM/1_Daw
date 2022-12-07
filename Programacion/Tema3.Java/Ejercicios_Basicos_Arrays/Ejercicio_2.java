public class Ejercicio_2 {
    public static void main(String[] args) {
        int arrayNum[] = new int[20];
        System.out.println("Asignando valores");
        for (int i = 0; i < 20; i++) {
                arrayNum[i] = i + 1;
                System.out.print(arrayNum[i] + " ");
        }
        System.out.println("Imprimiendo todos los elementos");
        System.out.println();
        for(int j = 1; j < 19; j++){
            if(j != 10){
                System.out.print(arrayNum[j] + " ");
            }
        }
        System.out.println();
        for(int k = 0; k < 20; k++){
            if(arrayNum[k] % 2 == 0){
                System.out.print(arrayNum[k] + " ");
            }
        }
    }
}
