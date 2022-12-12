package Ejercicio_5;

public class Pelicula {
    private String titulo, genero, director;
    private double duracion;
    private boolean comprado;

    public Pelicula(){
        comprado = false;
    }

    public Pelicula(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
        comprado = false;
    }

    public Pelicula(String titulo, String genero, String director, double duracion){
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        comprado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }
    
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public boolean getComprado(){
        return comprado;
    }

    public void comprar() {
        if(!comprado){
            comprado = true;
        } else {
            System.out.println("Ya se habia comprado");
        }
    }

    public void devolucion() {
        comprado = false;
    }

    public boolean compareTo(Pelicula peli) {
        if(this.duracion > peli.getDuracion()){
            return true;
        } else{
            return false;
        }
    }
}
