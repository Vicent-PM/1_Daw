import java.util.Scanner;

public class Cuadrado implements Geometria{

    @Override
    public double calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del lado");
        double lado = scanner.nextDouble();

        scanner.close();

        return lado * 4;
    }

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño del lado");
        double lado = scanner.nextDouble();

        scanner.close();

        return Math.pow(lado, 2);
    }
    
}
