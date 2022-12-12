package Ejercicio3;

enum Palo {
    Oros, Copas, Espadas, Bastos;
}

public class CartaEs extends Carta {

    private Palo palo;

    public CartaEs(int numCarta, String material, String colorReverso, Palo palo) {
        super(numCarta, material, colorReverso);
        this.palo = palo;
    }

    @Override
    public String getNumero() {
        if (getNumCarta() == 12) {
            return "Rey";
        } else if (getNumCarta() == 11) {
            return "Caballo";
        } else if (getNumCarta() == 10) {
            return "Sota";
        }
        return String.valueOf(getNumCarta());
    }

    public Palo getPalo() {
        return this.palo;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() + " palo: " + palo;
    }

}
