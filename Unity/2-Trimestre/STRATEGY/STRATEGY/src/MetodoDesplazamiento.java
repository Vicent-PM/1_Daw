import Interfaces.Strategy;

public class MetodoDesplazamiento {
    private Strategy metodoDesplazamiento;

    public MetodoDesplazamiento(Strategy metodoDesplazamiento) {
        this.metodoDesplazamiento = metodoDesplazamiento;
    }

    public void setMetodoDesplazamiento(Strategy metodoDesplazamiento) {
        this.metodoDesplazamiento = metodoDesplazamiento;
    }

    public void irAlAeropuerto() {
        System.out.println("Cojo las maletas");
        this.metodoDesplazamiento.execute();
        System.out.println("Facturo");
    }
}
