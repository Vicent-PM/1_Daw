package Ejercicio1;

public class App {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, "triangulo", true, "perfecto", 5, 7);
        System.out.println("El area del triangulo " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es " + triangulo.calculaPerimetro());

        Rectangulo rectangulo = new Rectangulo(4, "rectangulo", false, "verde", 25, 30);
        System.out.println("El area del rectangulo " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es " + rectangulo.calculaPerimetro());

        Pentagono pentagono = new Pentagono(5, "pentagono", true, "rojo", 6);
        System.out.println("El area del pentagono " + pentagono.calcularArea());
        System.out.println("El perimetro del pentagono es " + pentagono.calculaPerimetro());
    }
}
