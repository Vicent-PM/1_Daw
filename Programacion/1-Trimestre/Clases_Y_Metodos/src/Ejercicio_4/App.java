package Ejercicio_4;

public class App {
    public static void main(String[] args) {
        boolean boolPrestar;
        boolean boolDevolver;

        Libro libro1 = new Libro("Quijote", "Cervantes", 10, 6);
        boolPrestar = libro1.prestar(5);
        if (boolPrestar) {
            System.out.println("Se han prestado los libros");
        } else {
            System.out.println("No hay suficientes libros para prestar");
        }

        boolDevolver = libro1.devolver(4);
        if (boolDevolver) {
            System.out.println("Se han guardado los libros en la biblioteca");
        } else {
            System.out.println("No hay suficientes libros para guardar en la biblioteca");
        }
        libro1.mostrarDatos();

        Libro libro2 = new Libro("La Huerta", "Palomo", 5, 6);
        boolPrestar = libro2.prestar(3);
        if (boolPrestar) {
            System.out.println("Se han prestado los libros");
        } else {
            System.out.println("No hay suficientes libros para prestar");
        }

        boolDevolver = libro2.devolver(5);
        if (boolDevolver) {
            System.out.println("Se han guardado los libros en la biblioteca");
        } else {
            System.out.println("No hay suficientes libros para guardar en la biblioteca");
        }
        libro2.mostrarDatos();
    }
}
