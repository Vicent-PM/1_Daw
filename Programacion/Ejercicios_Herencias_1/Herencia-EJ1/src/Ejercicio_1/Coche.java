package Ejercicio_1;

public class Coche extends SimpleCar {
    private int anioLanz;
    protected String color, claxon;

    public Coche(String marca, String modelo, int nBas, int anioLanz, String color, String claxon) {
        super(marca, modelo, nBas);
        this.anioLanz = anioLanz;
        this.color = color;
        this.claxon = claxon;
    }

    public void sonarClaxon() {
        System.out.println(this.claxon);
    }

    public int getAnioLanz() {
        return anioLanz;
    }

    public void setAnioLanz(int anioLanz) {
        this.anioLanz = anioLanz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClaxon() {
        return claxon;
    }

    public void setClaxon(String claxon) {
        this.claxon = claxon;
    }
}
