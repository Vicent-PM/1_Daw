public class Caja {
    
    private double ancho, largo, alto;
    private String color;

    public Caja(double ancho, double largo, double alto, String color) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.color = color;
    }

    public Caja(double w, double l, double h) {
        ancho = w;
        largo = l;
        alto = h;
        color = "Marrón";
    }

    public Caja(double tamanio){
        ancho = tamanio;
        largo = tamanio;
        alto = tamanio;
    }

    public Caja() {
        ancho = 10;
        largo = 10;
        alto = 10;
    }

    public double calculaVolumen() {

        double volumen = ancho * largo * alto;
        return volumen;

    }

    public void setDimension(double w, double h, double l) {

        ancho = w;
        alto = h;
        largo = l;
        
    }

    public void setAncho(double w) {
        ancho = w;
    }

    public void imprimirCaja() {
        System.out.println("Ancho: " + ancho + " largo: " + largo + " alto: " + alto);
    }
}
