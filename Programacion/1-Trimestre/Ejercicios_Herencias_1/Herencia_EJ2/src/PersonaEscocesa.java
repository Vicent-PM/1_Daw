public class PersonaEscocesa extends PersonaInglesa {
    private boolean independentista;

    public PersonaEscocesa(String nombre, String pais, double libras, boolean independentista) {
        super(nombre, "Escocia", libras);
        this.independentista = independentista;
    }

    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        if (independentista) {
            System.out.println("Hello, I am " + getNombre() + " and I am Scottish");
        } else {
            System.out.println("Hello, I am " + getNombre() + " and I am British");
        }
    }
}
