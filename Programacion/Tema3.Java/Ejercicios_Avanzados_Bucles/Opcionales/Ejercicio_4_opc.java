package Opcionales;

public class Ejercicio_4_opc {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.println(n3);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3 >= 1000) {
                break;
            }
        }
    }
}
