package Ejercicio_1;

public class Coche {
    private String modelo, color, matricula;
    private boolean pintura;
    private int nPlazas;
    private double vMaxima;

    public Coche(String modelo, String color, String matricula, boolean pintura, int nPlazas, double vMaxima){
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.pintura = pintura;
        this.nPlazas = nPlazas;
        this.vMaxima = vMaxima;
    }

    public void impModeloyColor() {
        System.out.println("Modelo: " + modelo);
        if(pintura){
            System.out.println("Color: " + color + " metalizado");
        } else{
            System.out.println("Color: " + color);
        }
    }


}
