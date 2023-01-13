package Ejercicio_6;

public class Vehiculo {
    private String marca, modelo, matricula, fechaMatriculacion, color, tipoCombustible;
    private NIF dni;
    private int peso, volumen, nRuedas, nPasajeros;
    private boolean hayPasajeros, estaCargado;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String matricula, String fechaMatriculacion, String color,
            String tipoCombustible, NIF dni, int peso, int volumen, int nRuedas, int nPasajeros, boolean estaCargado) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.dni = dni;
        this.peso = peso;
        this.volumen = volumen;
        this.nRuedas = nRuedas;
        this.nPasajeros = nPasajeros;
        this.estaCargado = estaCargado;
    }

    public Vehiculo(String marca, String modelo, String matricula, String fechaMatriculacion, String color,
            String tipoCombustible, NIF dni, int peso, int volumen, int nRuedas, int nPasajeros, boolean hayPasajeros,
            boolean estaCargado) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.dni = dni;
        this.peso = peso;
        this.volumen = volumen;
        this.nRuedas = nRuedas;
        this.nPasajeros = nPasajeros;
        this.hayPasajeros = hayPasajeros;
        this.estaCargado = estaCargado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public NIF getDni() {
        return dni;
    }

    public void setDni(NIF dni) {
        this.dni = dni;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public boolean isHayPasajeros() {
        return hayPasajeros;
    }

    public void setHayPasajeros(boolean hayPasajeros) {
        this.hayPasajeros = hayPasajeros;
    }

    public boolean isEstaCargado() {
        return estaCargado;
    }

    public void setEstaCargado(boolean estaCargado) {
        this.estaCargado = estaCargado;
    }

    public String imprimirDatos() {
        return "DNI: " + dni.mostrarNIF() + "\n" + marca + " " + modelo + " | " + matricula + " | " + fechaMatriculacion + "\n"
                + color + " - " + peso + "KG - " + volumen + "L - " + nRuedas + " - " + tipoCombustible + "\n"
                + nPasajeros + " - " + estaCargado;
    }
}
