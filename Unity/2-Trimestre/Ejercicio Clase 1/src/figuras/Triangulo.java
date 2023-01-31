package figuras;

import interfaces.Geometria;

public class Triangulo extends Figura {
    private double lado;
    private double a1, a2, a3;

    

    public Triangulo(String nombre, double lado, double a1, double a2, double a3) {
        super(nombre);
        this.lado = lado;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) * this.lado) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 3;
    }

    public boolean comprobarIntegridad(){
        return a1 + a2 + a3 == 180;
    }

}
