package Ejercicio3;

public class BarajaEs {
    private CartaEs barajaCartaEs[][];

    public BarajaEs() {
        barajaCartaEs = new CartaEs[4][12];

        for (int i = 0; i < barajaCartaEs.length; i++) {
            for (int j = 0; j < barajaCartaEs[i].length; j++) {
                barajaCartaEs[i][j] = new CartaEs((j + 1), null, null, Palo.values()[i]);
            }
        }
    }

    public Carta darCarta() {
        for (int i = barajaCartaEs.length - 1; i >= 0; i--) {
            for (int j = barajaCartaEs[i].length - 1; j >= 0; j--) {
                if (barajaCartaEs[i][j] != null) {
                    CartaEs varAux = barajaCartaEs[i][j];
                    barajaCartaEs[i][j] = null;
                    return varAux;
                }
            }
        }
        return null;
    }

    public boolean hayCartas() {
        for (int i = 0; i < barajaCartaEs.length; i++) {
            for (int j = 0; j < barajaCartaEs[i].length; j++) {
                if (barajaCartaEs[i][j] != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimirBaraja() {
        for (int i = 0; i < barajaCartaEs.length; i++) {
            for (int j = 0; j < barajaCartaEs[i].length; j++) {
                System.out.println(barajaCartaEs[i][j]);
            }
            System.out.println();
        }
    }

}
