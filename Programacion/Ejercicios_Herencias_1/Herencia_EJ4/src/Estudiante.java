public class Estudiante extends Person {
    private double nota;
    private boolean disponible;

    public Estudiante(String nombre, int edad, int sexo, double nota, boolean disponible) {
        super(nombre, edad, sexo);
        this.nota = nota;
        this.disponible = disponible;
    }

    public Estudiante() {
        this.nota = (int) (Math.random() * 10) + 1;
        this.disponible = disponibilidad();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean disponibilidad() {
        int numeroAleatorio = (int) (Math.random() * 100) + 0;

        if (numeroAleatorio > 50) {
            return false;
        } else {
            return true;
        }
    }
}
