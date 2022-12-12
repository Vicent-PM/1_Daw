public class Aula {
    private static int id;
    private final int max;
    private String asignatura;
    private Profesor profesor;
    private Estudiante[] arrayEstudiantes;

    public Aula(int id, int max, String asignatura, Profesor profesor, Estudiante[] arrayEstudiantes) {
        this.id = id;
        this.max = max;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.arrayEstudiantes = new Estudiante[max];
    }

    public int getId() {
        return id;
    }

    public int getMax() {
        return max;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante[] getArrayEstudiantes() {
        return arrayEstudiantes;
    }

    public void setArrayEstudiantes(Estudiante[] arrayEstudiantes) {
        this.arrayEstudiantes = arrayEstudiantes;
    }

    public void addAlumno(Estudiante alumno) {
        for (int i = 0; i < arrayEstudiantes.length; i++) {
            if(arrayEstudiantes != null){
                arrayEstudiantes[i] = alumno;
            }
        }
    }

    
}
