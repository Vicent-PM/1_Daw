package Ejercicio_6;

public class NIF {
    private int DNI;
    private char letra;

    public char calcularLetra(int DNI) {
        int letraDNI = DNI % 23;
        char[] caracteres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E' };
        return (char) caracteres[letraDNI];
    }

    public NIF(int nDNI) {
        this.DNI = nDNI;
        this.letra = calcularLetra(nDNI);
    }

    public String mostrarNIF() {
        return DNI + "-" + letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    
}
