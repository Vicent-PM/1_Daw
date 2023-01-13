package Ejercicio_4;

public class Profesor {
    private String nombre, apellidos, especialidad;
    private int edad;
    private boolean casado;
    private double salario;

    public Profesor(String nombre, String apellidos, String especialidad, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String imprimirDatos() {
        return "Nombre: " + nombre + ", apellidos: " + apellidos + ", especialidad: " + especialidad + ", edad: " + edad
                + ", casado: " + casado + ", salario: " + salario;
    }

    public void cambiarDatos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void cambiarDatos(boolean casado) {
        if (casado) {
            this.casado = true;
            salario += salario * 0.02;
        } else {
            this.casado = false;
        }
    }

    public void cambiarDatos(String especialidad, double salario) {
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public void cambiarDatos() {
        salario += salario * 0.1;
    }

    public void cambiarDatos(String nombre, String apellidos, boolean casado, String especialidad, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.salario = salario;

        if (casado) {
            this.casado = true;
            this.salario += salario * 0.02;
        } else {
            this.casado = false;
        }

        this.salario += salario * 0.1;
    }
}
