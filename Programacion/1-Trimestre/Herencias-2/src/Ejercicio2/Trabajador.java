package Ejercicio2;

public abstract class Trabajador {
    protected final double SALARIO_BASE = 30000;
    private String nombre, puesto;
    private int edad, numSeg, telefono;

    public Trabajador(String nombre, String puesto, int telefono, int edad, int numSeg) {
        this.nombre = nombre;
        this.puesto = puesto;

        if (telefono < 99999999) {
            String prefijo = "953" + "" + telefono;
            this.telefono = Integer.parseInt(prefijo);
        } else {
            this.telefono = telefono;
        }

        this.edad = edad;
        this.numSeg = numSeg;
    }

    public Trabajador() {
        this.nombre = "";
        this.puesto = "";
        this.telefono = 0;
        this.edad = 0;
        this.numSeg = 0;
    }

    public double getSALARIO_BASE() {
        return SALARIO_BASE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumSeg() {
        return numSeg;
    }

    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (telefono < 99999999) {
            String prefijo = "953" + "" + telefono;
            this.telefono = Integer.parseInt(prefijo);
        } else {
            this.telefono = telefono;
        }
    }

    public abstract double calcularSalario(double pluses);

    @Override
    public String toString() {
        return "[SALARIO_BASE=" + SALARIO_BASE + ", nombre=" + nombre + ", puesto=" + puesto + ", edad="
                + edad + ", numSeg=" + numSeg + ", telefono=" + telefono;
    }
}
