public class PersonaInglesa extends Persona {
    private String pais;
    private double libras;

    public PersonaInglesa(String nombre, String pais, double libras) {
        super(nombre);
        this.pais = pais;
        this.libras = libras;
    }

    @Override
    public void saludar() {
        // TODO Auto-generated method stub
        System.out.println("Hello, I am " + getNombre());
        System.out.println("Se ha tomado " + contador());
    }

    public void tomarTe() {
        libras -= 1.5;
        System.out.println("El te a costado 1.5 libras");
        contador();
    }

    public static int contador() {
        int cont = 0;
        cont += 1;
        return cont;
    }
}
