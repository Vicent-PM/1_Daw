package Ejercicio1;

public abstract class Poligono {
    private int numLados;
    private String nombreFigura;
    private boolean regular;

    public Poligono(int numLados, String nombreFigura, boolean regular) {
        this.numLados = numLados;
        this.nombreFigura = nombreFigura;
        this.regular = regular;
    }

    public Poligono() {
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public abstract double calcularArea();

    public abstract double calculaPerimetro();
}
