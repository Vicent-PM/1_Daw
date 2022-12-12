package Ejercicio_4;

public class App {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Vicente", "Pedraza Montavez", "Programacion", 28, true, 1800);
        Profesor profesor2 = new Profesor();

        System.out.println(profesor1.imprimirDatos());
        System.out.println(profesor2.imprimirDatos());

        profesor2.cambiarDatos("Alberto", "Montavez Sanchez", false, "E.F.", 1700.5);
        profesor2.setEdad(25);
        System.out.println(profesor2.imprimirDatos());
    }
}
