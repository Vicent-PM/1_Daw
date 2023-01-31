package interfaces;

public interface Geometria extends Comparable<Geometria>{
    double calcularPerimetro();
    double calcularArea();
    String getNombre();
}
