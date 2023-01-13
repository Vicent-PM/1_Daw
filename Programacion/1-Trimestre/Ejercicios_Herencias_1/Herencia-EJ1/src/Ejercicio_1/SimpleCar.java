package Ejercicio_1;

public class SimpleCar {
    private String marca, modelo;
    private int nBas;

    public SimpleCar(String marca, String modelo, int nBas) {
        this.marca = marca;
        this.modelo = modelo;
        this.nBas = nBas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnBas() {
        return nBas;
    }

    public void setnBas(int nBas) {
        this.nBas = nBas;
    }

}
