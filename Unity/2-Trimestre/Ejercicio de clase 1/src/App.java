import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();

        System.out.println("El area del triangulo es: " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());

        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());

        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());

        HashSet<Geometria> ColGeo1 = new HashSet<Geometria>();

        ColGeo1.add(triangulo);
        ColGeo1.add(cuadrado);
        ColGeo1.add(circulo);

        Triangulo triangulo2 = new Triangulo();
        Cuadrado cuadrado2 = new Cuadrado();

        HashSet<Geometria> ColGeo2 = new HashSet<Geometria>();

        ColGeo2.add(triangulo2);
        ColGeo2.add(cuadrado2);
        ColGeo2.add(circulo);

        ColGeo1.addAll(ColGeo2);
        ColGeo1.retainAll(ColGeo2);
    }
}
