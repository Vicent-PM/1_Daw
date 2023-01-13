package Ejercicio_2;

public class App {
    public static void main(String[] args) {
        
        Circulo circ1 = new Circulo(10);
        circ1.area();
        circ1.circunferencia();
        System.out.println(circ1.imprimir());

        Circulo circ2 = new Circulo(20);
        circ2.area();
        circ2.circunferencia();
        System.out.println(circ2.imprimir());
    }
}
