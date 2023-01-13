package Ejercicio_6;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Vicente", 18, null, 'H', 80, 185);
        Persona persona2 = new Persona("Alberto", 16, null, 'H', 55, 179);

        if (persona1.calcularIMC() == -1) {
            System.out.println("El imc es menor a 20");
        } else if (persona1.calcularIMC() == 0) {
            System.out.println("EL imc esta entre 20 y 25");
        } else {
            System.out.println("El imc es mayor a 25");
        }

        if (persona2.calcularIMC() == -1) {
            System.out.println("El imc es menor a 20");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("EL imc esta entre 20 y 25");
        } else {
            System.out.println("El imc es mayor a 25");
        }
        if (persona1.esMayorEdad()) {
            System.out.println("Si es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        if (persona2.esMayorEdad()) {
            System.out.println("Si es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        persona1.generarDNI();
        System.out.println(persona1.imprimir());
    }

}
