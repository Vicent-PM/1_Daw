package Ejercicio1;

public class Pentagono extends Poligono{
    private String color;
    private double tamLado;
    
    public Pentagono(int numLados, String nombreFigura, boolean regular, String color, double tamLado) {
        super(numLados, nombreFigura, regular);
        this.color = color;
        this.tamLado = tamLado;
    }

    @Override
    public double calculaPerimetro() {
        // TODO Auto-generated method stub
            return 5 * tamLado;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        if(isRegular()){
            return (5 * (tamLado * tamLado)) / 2.9;
        }
        return 0;
    }

    
}
