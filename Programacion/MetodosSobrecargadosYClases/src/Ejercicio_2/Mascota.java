package Ejercicio_2;

public class Mascota {
    private String nombreMascota, nombreDueño, apellidosDueño, fechaNacimiento, raza;
    private boolean tieneChip;

    public Mascota(String nombreMascota, String fechaNacimiento, boolean tieneChip, String raza, String nombreDueño,
            String apellidosDueño) {
        this.nombreMascota = nombreMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.tieneChip = tieneChip;
        this.raza = raza;
        this.nombreDueño = nombreDueño;
        this.apellidosDueño = apellidosDueño;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean getTieneChip() {
        return tieneChip;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setApellidosDueño(String apellidosDueño) {
        this.apellidosDueño = apellidosDueño;
    }

    public String getApellidosDueño() {
        return apellidosDueño;
    }

    public void cambiarDatos(String nombreDueño, String apellidosDueño) {
        this.nombreDueño = nombreDueño;
        this.apellidosDueño = apellidosDueño;
    }

    public void cambiarDatos(String fechaNacimiento, boolean tieneChip) {
        this.fechaNacimiento = fechaNacimiento;
        this.tieneChip = tieneChip;
    }

    public void cambiarDatos(String nombreMascota, String fechaNacimiento, boolean tieneChip, String raza,
            String nombreDueño, String apellidosDueño) {
        this.nombreMascota = nombreMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.tieneChip = tieneChip;
        this.raza = raza;
        this.nombreDueño = nombreDueño;
        this.apellidosDueño = apellidosDueño;
    }

}
