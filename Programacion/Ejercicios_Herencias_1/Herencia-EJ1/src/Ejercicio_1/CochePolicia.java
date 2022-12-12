package Ejercicio_1;

public class CochePolicia extends Coche {
    private String sirena;

    

    public CochePolicia(String marca, String modelo, int nBas, int anioLanz, String color, String claxon,
            String sirena) {
        super(marca, modelo, nBas, anioLanz, "blanco", claxon);
        this.sirena = sirena;
    }



    public void sirena() {
        System.out.println(this.sirena);
    }

}
