package Ejercicio_1;

public abstract class Electrodomestico {
    private double precio, peso;
    private String color;
    private char consumo;
    private boolean estaEncendido;

    public Electrodomestico() {
        this.color = "blanco";
        this.precio = 100;
        this.peso = 5;
        this.consumo = 'F';
        estaEncendido = false;
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = "blanco";
        this.consumo = 'F';
        estaEncendido = false;
    }

    public Electrodomestico(double precio, double peso, String color, char consumo, boolean estaEncendido) {
        this.precio = precio;
        this.peso = peso;
        if (color != "blanco" || color != "negro" || color != "rojo" || color != "azul" || color != "gris") {
            this.color = "blanco";
        } else {
            this.color = color;
        }
        this.consumo = checkConsumo(consumo);
        this.estaEncendido = estaEncendido;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void apagar() {
        this.estaEncendido = false;
    }

    public void encender() {
        this.estaEncendido = true;
    }

    public char checkConsumo(char letra) {
        for (char i = 'A'; i <= 'F'; i++) {
            if (i == letra) {
                return letra;
            }
        }
        return 'F';
    }

    @Override
    public String toString() {
        return "Electrodomestico [precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo
                + ", estaEncendido=" + estaEncendido + "]";
    }

    public abstract double precioFinal();

}
