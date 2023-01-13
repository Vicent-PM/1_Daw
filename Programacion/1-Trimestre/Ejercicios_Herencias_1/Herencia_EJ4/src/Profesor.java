public class Profesor extends Person {
    private String asignatura;
    private boolean disponible;

    

    public Profesor(String nombre, int edad, int sexo, String asignatura, boolean disponible) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
        this.disponible = disponible;
    }

    public Profesor() {
        this.asignatura = "Sin asignatura";
        this.setEdad((int) (Math.random() * 65) + 25);
        this.disponible = disponibilidad();
    }

    public boolean disponibilidad() {
        int numeroAleatorio = (int) (Math.random() * 100) + 0;

        if (numeroAleatorio > 10) {
            return false;
        } else {
            return true;
        }
    }
    
}
