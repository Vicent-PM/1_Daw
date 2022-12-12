package Ejercicio_1;

public class ProbarCoche {
    public static void main(String[] args) {
        Coche renaultKoleos = new Coche("Renault", "Koleos", 5368745, 2015, "Blanco", "Pi Pi");

        renaultKoleos.setColor("Negro");
        renaultKoleos.sonarClaxon();

        CochePolicia policia = new CochePolicia("Nissan", "X-Trail", 56874, 2022, "Blanco", "Mec Mec", "Ni No Ni No");

        policia.sonarClaxon();
        policia.sirena();
    }
}
