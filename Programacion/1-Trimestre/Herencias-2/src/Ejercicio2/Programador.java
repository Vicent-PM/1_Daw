package Ejercicio2;

public class Programador extends Trabajador{
    private double impuestos;
    private static int pagas = 14;;

    public Programador(String nombre, String puesto, int telefono, int edad, int numSeg, double impuestos) {
        super(nombre, puesto, telefono, edad, numSeg);
        if(impuestos > 30){
            this.impuestos = 30;
        } else{
            this.impuestos = impuestos;
        }
    }

    public Programador(){
        this.impuestos = 0;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        if(impuestos > 30){
            this.impuestos = 30;
        } else{
            this.impuestos = impuestos;
        }
    }

    public static int getPagas() {
        return pagas;
    }

    public static void setPagas(int pagas) {
        Programador.pagas = pagas;
    }

    @Override
    public double calcularSalario(double pluses) {
        return (SALARIO_BASE - (SALARIO_BASE * (impuestos / 100))) / pagas;
    }

    @Override
    public String toString() {
        return "Programador " + super.toString() + "impuestos=" + impuestos + "]";
    }

    
}
