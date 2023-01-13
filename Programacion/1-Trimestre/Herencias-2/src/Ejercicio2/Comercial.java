package Ejercicio2;

public class Comercial extends Trabajador{
    private double tarifa;
    private int horas;

    
    public Comercial(String nombre, String puesto, int telefono, int edad, int numSeg, double tarifa, int horas) {
        super(nombre, puesto, telefono, edad, numSeg);
        if(tarifa < 40){
            this.tarifa = tarifa;
        } else{
            this.tarifa = 40;
        }
        this.horas = horas;
    }

    public Comercial() {
        this.tarifa = 0;
    }

    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        if(tarifa < 40){
            this.tarifa = tarifa;
        } else{
            this.tarifa = 40;
        }
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularSalario(double pluses) {
        return this.horas * tarifa;
    }

    @Override
    public String toString() {
        return "Comercial " + super.toString() + " tarifa=" + tarifa + ", horas=" + horas + "]";
    }
}
