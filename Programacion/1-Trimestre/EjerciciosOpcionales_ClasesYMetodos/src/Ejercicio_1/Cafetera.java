package Ejercicio_1;

public class Cafetera {
    private int capacidadMaxima, cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int llenarCafetera() {
        return cantidadActual = capacidadMaxima;
    }

    public int servirTaza(int capacidadTaza) {
        if(cantidadActual < capacidadTaza){
            return cantidadActual -= cantidadActual;
        } else {
            return cantidadActual -= capacidadTaza;
        }
    }

    public int vaciarCafetera() {
       return cantidadActual -= cantidadActual; 
    }

    public int agregarCafe(int cantidadCafe) {
        return cantidadCafe += cantidadCafe;
    }
}
