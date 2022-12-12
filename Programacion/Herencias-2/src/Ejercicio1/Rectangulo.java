package Ejercicio1;

public class Rectangulo extends Poligono {
    private String color;
    private double tamBase, tamAltura;

    public Rectangulo(int numLados, String nombreFigura, boolean regular, String color, double tamBase,
            double tamAltura) {
        super(numLados, nombreFigura, regular);
        this.color = color;
        this.tamBase = tamBase;
        this.tamAltura = tamAltura;
    }

    @Override
    public double calculaPerimetro() {
        // TODO Auto-generated method stub
        return 2 * tamAltura + 2 * tamBase;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return tamBase * tamAltura;
    }

    public boolean esUnCuadrado() {
        if (tamBase == tamAltura) {
            return true;
        }
        return false;
    }

}
