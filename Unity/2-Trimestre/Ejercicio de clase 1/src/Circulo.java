import java.util.Scanner;

public class Circulo implements Geometria{

    @Override
    public double calcularPerimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el diametro del circulo");
        double diametro = scanner.nextDouble();

        scanner.close();

        return diametro * Math.PI;
    }

    @Override
    public double calcularArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio del circulo");
        double radio = scanner.nextDouble();

        scanner.close();

        return Math.PI * Math.pow(radio, 2);
    }
}
