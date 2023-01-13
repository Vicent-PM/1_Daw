import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula = 0;
        int aprobado = 0;
        int suspenso = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce la nota " + i);
            double nota = scanner.nextDouble();

            if (nota > 9) {
                matricula = matricula + 1;
            } else if (nota <= 5 && nota <= 9) {
                aprobado = aprobado + 1;
            } else {
                suspenso = suspenso + 1;
            }
        }
        System.out.println("Hay " + matricula + " con matricula de honor");
        System.out.println("Hay " + aprobado + " aprobados");
        System.out.println("Hay " + suspenso + " suspensos");

        scanner.close();
    }
}
