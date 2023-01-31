import java.util.Scanner;

public class Triangulo implements Geometria {

    @Override
    public double calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del lado");
        double lado = scanner.nextDouble();

        scanner.close();

        return lado * 3;
    }

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la base");
        double base = scanner.nextDouble();

        System.out.println("Introduce el tamaño de la altura");
        double altura = scanner.nextDouble();

        scanner.close();

        return (base * altura) / 2;
    }

}
