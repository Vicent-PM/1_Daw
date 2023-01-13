public class PersonaItaliana extends Persona {
    private String region;
    private boolean esMafioso;

    public PersonaItaliana(String nombre, String region, boolean esMafioso) {
        super(nombre);
        this.region = region;
        this.esMafioso = esMafioso;
    }

    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        if (esMafioso) {
            System.out.println("Cosa nostra");
        } else {
            System.out.println("Ciao");
        }
    }
}
