public class Jugador {
    private int dorsal, goles, asistencias, amarillas;
    private boolean expulsado;

    public Jugador(int dorsal) {
        this.dorsal = dorsal;
        this.goles = 0;
        this.asistencias = 0;
        this.amarillas = 0;
        this.expulsado = false;
    }

    public void gol() {
        if (!this.expulsado) {
            this.goles += 1;
        } else {
            System.out.println("Este jugador esta expulsado no puede marcar");
        }

    }

    public void asistencia() {
        if (!expulsado)
            this.asistencias += 1;
        else
            System.out.println("Este jugador esta expulsado no puede haber hecho una asistencia");
    }

    public void amarilla() {
        if (!expulsado)
            this.amarillas += 1;
        else
            System.out.println("Este jugador esta expulsado no puede recibir amarilla");

        if (this.amarillas >= 2)
            expulsado = true;
    }

    public void haSidoExpulsado() {
        this.expulsado = true;
    }

    @Override
    public String toString() {
        return "Informacion del jugador nº " + this.dorsal + "\nGoles: " + this.goles + "\nAsistencias: "
                + this.asistencias + "\nAmarillas: " + this.amarillas + "\nExpulsado: " + this.expulsado;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public boolean isExpulsado() {
        return expulsado;
    }

    public void setExpulsado(boolean expulsado) {
        this.expulsado = expulsado;
    }
}
