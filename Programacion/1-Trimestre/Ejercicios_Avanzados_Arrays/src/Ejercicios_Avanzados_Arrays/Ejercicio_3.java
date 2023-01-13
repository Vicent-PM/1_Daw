import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Arrays 1 y 2");
        System.out.println("2. Arrays 3 y 4");
        System.out.println("3. Arrays 5 y 6");
        System.out.print("Que dos arrays quieres comparar: ");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                compArray1();
                break;
            case 2:
                compArray2();
                break;
            case 3:
                compArray3();
                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        scanner.close();
    }

    public static void compArray1() {
        int[] array1_1 = { 1, 2, 3 };
        int[] array1_2 = { 1, 2, 3 };
        int mayor;
        boolean iguales = false;

        if (array1_1.length > array1_2.length) {
            mayor = array1_1.length;
        } else {
            mayor = array1_2.length;
        }

        for (int i = 0; i < mayor; i++) {
            if (array1_1[i] != array1_2[i]) {
                iguales = false;
            } else {
                iguales = true;
            }
        }

        if (!iguales) {
            System.out.println("No son iguales");
        } else {
            System.out.println("Si son iguales");
        }
    }

    public static void compArray2() {
        int[] array2_1 = { 1, 2, 3, 4 };
        int[] array2_2 = { 1, 2, 3, 4 };
        int mayor;
        boolean iguales = false;

        if (array2_1.length > array2_2.length) {
            mayor = array2_1.length;
        } else {
            mayor = array2_2.length;
        }
        
        for (int i = 0; i < mayor; i++) {
            if (array2_1[i] != array2_2[i]) {
                iguales = false;
            } else {
                iguales = true;
            }
        }

        if (!iguales) {
            System.out.println("No son iguales");
        } else {
            System.out.println("Si son iguales");
        }
    }

    public static void compArray3() {
        int[] array3_1 = { 1, 2, 3 };
        int[] array3_2 = { 3, 4, 5 };
        int mayor;
        boolean iguales = false;

        if (array3_1.length > array3_2.length) {
            mayor = array3_1.length;
        } else {
            mayor = array3_2.length;
        }

        for (int i = 0; i < mayor; i++) {
            if (array3_1[i] != array3_2[i]) {
                iguales = false;
            } else {
                iguales = true;
            }
        }

        if (!iguales) {
            System.out.println("No son iguales");
        } else {
            System.out.println("Si son iguales");
        }
    }
}
