package Ejercicio3;

public abstract class Carta {
    private int numCarta;
    private String material, colorReverso;

    public Carta(int numCarta, String material, String colorReverso) {
        this.numCarta = numCarta;
        this.material = material;
        this.colorReverso = colorReverso;
    }

    public abstract String getNumero();

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColorReverso() {
        return colorReverso;
    }

    public void setColorReverso(String colorReverso) {
        this.colorReverso = colorReverso;
    }

}
