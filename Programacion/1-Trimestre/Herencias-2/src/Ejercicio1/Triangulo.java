package Ejercicio1;

public class Triangulo extends Poligono {
    private String tipoTriangulo;
    private double tamBase, tamAltura;

    public Triangulo(int numLados, String nombreFigura, boolean regular, String tipoTriangulo, double tamBase,
            double tamAltura) {
        super(numLados, nombreFigura, regular);
        this.tipoTriangulo = tipoTriangulo;
        this.tamBase = tamBase;
        this.tamAltura = tamAltura;
    }

    @Override
    public double calculaPerimetro() {
        // TODO Auto-generated method stub
        if(tipoTriangulo == "perfecto"){
            return tamBase * 3;
        }
        return 0;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return tamAltura * tamBase / 2;
    }

    
}
