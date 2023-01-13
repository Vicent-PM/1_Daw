package Ejercicio3;

public class BarajaFr {
    private CartaFr barajaCartaFr[][];

    public BarajaFr() {
        barajaCartaFr = new CartaFr[4][12];

        for (int i = 0; i < barajaCartaFr.length; i++) {
            for (int j = 0; j < barajaCartaFr[i].length; j++) {
                barajaCartaFr[i][j] = new CartaFr((j + 1), null, null, PaloFr.values()[i]);
            }
        }
    }

    public Carta darCarta() {
        for (int i = barajaCartaFr.length - 1; i >= 0; i--) {
            for (int j = barajaCartaFr[i].length - 1; j >= 0; j--) {
                if (barajaCartaFr[i][j] != null) {
                    CartaFr varAux = barajaCartaFr[i][j];
                    barajaCartaFr[i][j] = null;
                    return varAux;
                }
            }
        }
        return null;
    }

    public boolean hayCartas() {
        for (int i = 0; i < barajaCartaFr.length; i++) {
            for (int j = 0; j < barajaCartaFr[i].length; j++) {
                if (barajaCartaFr[i][j] != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimirBaraja() {
        for (int i = 0; i < barajaCartaFr.length; i++) {
            for (int j = 0; j < barajaCartaFr[i].length; j++) {
                System.out.println(barajaCartaFr[i][j]);
            }
            System.out.println();
        }
    }
}
