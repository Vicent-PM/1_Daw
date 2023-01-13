package Ejercicio_5;

public class App {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Piratas 1", "Accion", "JK", 2.1);
        Pelicula pelicula2 = new Pelicula("Piratas 2", "Accion", "JK", 2.2);
        Pelicula pelicula3 = new Pelicula("Piratas 3", "Accion", "JK", 2.3);
        Pelicula pelicula4 = new Pelicula("Piratas 4", "Accion", "JK", 3.1);
        Pelicula pelicula5 = new Pelicula("Piratas 5", "Accion", "JK", 2.7);

        Pelicula[] arrayPeliculas = {pelicula1, pelicula2, pelicula3, pelicula4, pelicula5};

        pelicula1.comprar();
        pelicula3.comprar();
        pelicula5.comprar();

        for (int i = 0; i < arrayPeliculas.length; i++) {
            System.out.println("La pelicula " + (i + 1) + " esta comprada: " + arrayPeliculas[i].getComprado());
        }

        int k = 0;
        for (int j = 1; j < arrayPeliculas.length; j++) {
            if(arrayPeliculas[j].compareTo(arrayPeliculas[k])){
                k = j;
            }
            
        }

        System.out.println("La pelicula de mayor duracion es la numero: " + (k + 1));

    }
}
