package figuras;

import interfaces.Geometria;

public abstract class Figura implements Geometria {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();

    @Override
    public int compareTo(Geometria o) {
        double areaA = this.calcularArea();
        double areaB = o.calcularArea();

        if (areaA > areaB)
            return 1;
        else if (areaA < areaB)
            return -1;
        else
            return 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
