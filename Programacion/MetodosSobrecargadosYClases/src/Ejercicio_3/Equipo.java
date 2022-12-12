package Ejercicio_3;

public class Equipo {
    private String nombre, ciudad;
    private int puntos, golesFavor, golesContra;

    public Equipo(String nombre, String ciudad, int puntos, int golesFavor, int golesContra) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
    }

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void partido(String resultado) {
        if (resultado == "ganado") {
            puntos += 3;
        } else if (resultado == "empatado") {
            puntos += 1;
        } else {
            puntos += 0;
        }
    }

    public void partido(String resultado, int golesFavor) {
        if (resultado == "ganado") {
            puntos += 3;
        } else if (resultado == "empatado") {
            puntos += 1;
        } else {
            puntos += 0;
        }

        this.golesFavor += golesFavor;
    }

    public void partido(String resultado, int golesFavor, int golesContra) {
        if (resultado == "ganado") {
            puntos += 3;
        } else if (resultado == "empatado") {
            puntos += 1;
        } else {
            puntos += 0;
        }

        this.golesFavor += golesFavor;
        this.golesContra += golesContra;
    }
}
