package Ejercicio_1;

public class App {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        Cafetera cafetera2 = new Cafetera(1000);
        Cafetera cafetera3 = new Cafetera(1500, 150);

        cafetera.llenarCafetera();
        cafetera2.servirTaza(150);
        cafetera3.vaciarCafetera();
        cafetera3.agregarCafe(250);
    }
}
