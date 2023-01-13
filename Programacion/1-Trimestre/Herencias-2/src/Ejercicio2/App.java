package Ejercicio2;

public class App {
    public static void main(String[] args) {
        Comercial come = new Comercial("Vicente", "Prog", 653399296, 18, 1578954, 35, 42);
        System.out.println(come.calcularSalario(250));
        System.out.println(come.toString());
        Programador prog = new Programador("Vicente", "Jefe", 653399296, 18, 15478952, 4);
        System.out.println(prog.calcularSalario(350));
        System.out.println(prog.toString());
    }
}
