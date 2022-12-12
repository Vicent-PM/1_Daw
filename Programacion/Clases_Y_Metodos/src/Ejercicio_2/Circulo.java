package Ejercicio_2;

public class Circulo {

    private double radio;
    private double PI = 3.14159265359;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        double a = PI * Math.pow(radio, 2);
        return a;
    }

    public double circunferencia() {
        double c = (radio * 2) * PI;
        return c;
    }

    public String imprimir() {
        return "El area es " + area() + " la circunferencia es " + circunferencia();
    }
}
