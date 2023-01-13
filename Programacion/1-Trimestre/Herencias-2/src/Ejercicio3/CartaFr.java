package Ejercicio3;

enum PaloFr {
    Corazones, Diamantes, Treboles, Picas;
}

public class CartaFr extends Carta {
    private PaloFr palo;

    public CartaFr(int numCarta, String material, String colorReverso, PaloFr palo) {
        super(numCarta, material, colorReverso);
        this.palo = palo;
    }

    @Override
    public String getNumero() {
        if (getNumCarta() == 12) {
            return "K";
        } else if (getNumCarta() == 11) {
            return "Q";
        } else if (getNumCarta() == 10) {
            return "J";
        } else if(getNumCarta() == 1){
            return "As";
        }
        return String.valueOf(getNumCarta());
    }

    public PaloFr getPalo() {
        return this.palo;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() + " palo: " + palo;
    }
}
