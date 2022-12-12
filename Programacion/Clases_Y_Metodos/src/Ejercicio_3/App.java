package Ejercicio_3;

public class App {
    public static void main(String[] args) {
        Reloj fecha1 = new Reloj(13, 40, 10);
        System.out.println(fecha1.mostrarHora());
        System.out.println(fecha1.mostrarHoraFormato(12));
    }
}
