package Ejercicio_1;

public class Television extends Electrodomestico {
    private int pulgadas, canal, nivelVolumen;
    private String marca, modelo;

    public Television() {
        this.pulgadas = 20;
        this.canal = 1;
        this.nivelVolumen = 50;
        this.marca = "Sony";
        this.modelo = "Bravia";
    }

    public Television(double precio, double peso, String color, char consumo, boolean estaEncendido, int pulgadas,
            String marca, String modelo) {
        super(precio, peso, color, consumo, estaEncendido);
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void encender() {
        super.encender();
        this.canal = 1;
        this.nivelVolumen = 20;
    }

    public void subirVolumen() {
        this.nivelVolumen += 1;
    }

    public void bajarBolumen() {
        this.nivelVolumen -= 1;
    }

    @Override
    public double precioFinal() {
        double pConsumo = 10;
        int cont = 0;
        for (char i = 'F'; i >= 'A'; i++) {
            cont += 1;
            if (getConsumo() == i) {
                break;
            }
        }

        if (getConsumo() == 'F') {
            pConsumo = 10;
        } else {
            pConsumo += cont * 20;
        }

        return (this.pulgadas * 20) + pConsumo + getPrecio();
    }

}
