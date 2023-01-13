package Ejercicio_4;

public class Libro {
    private String titulo, autor;
    private int nBiblioteca, nPrestados;

    public Libro(String titulo, String autor, int nBiblioteca, int nPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nBiblioteca = nBiblioteca;
        this.nPrestados = nPrestados;
    }

    public boolean prestar(int cantidad) {
        if(cantidad <= nBiblioteca){
            nBiblioteca -= cantidad;
            nPrestados += cantidad;
            return true;
        } else{
            return false;
        }
    }

    public boolean devolver(int cantidad) {
        if(cantidad <= nPrestados){
            nBiblioteca += cantidad;
            nPrestados -= cantidad;
            return true;
        } else{
            return false;
        }
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo + ", autor: " + autor + ", numero de libros en la biblioteca: " + nBiblioteca + ", numero de libros prestados: " + nPrestados);
    }
}
