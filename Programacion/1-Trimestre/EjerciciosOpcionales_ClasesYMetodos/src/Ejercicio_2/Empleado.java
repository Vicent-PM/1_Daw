package Ejercicio_2;

public class Empleado {
    private String NIF;
    private int horasExtra, numeroHijos;
    private double sueldoBase, ppHora, IRPF;
    private boolean estaCasado;

    public Empleado(String NIF, int horasExtra, int numeroHijos, double sueldoBase, double ppHora, double IRFP, boolean estaCasado){
        this.NIF = NIF;
        this.horasExtra = horasExtra;
        this.numeroHijos = numeroHijos;
        this.sueldoBase = sueldoBase;
        this.ppHora = ppHora;
        this.IRPF = IRFP;
        this.estaCasado = estaCasado;
    }

    public double calcularPagoHE() {
        double pagoHE = ppHora * horasExtra;
        return pagoHE;
    }

    public double retencionIRPF() {
        if(estaCasado){
            IRPF -= 2;
            IRPF -= numeroHijos;
        }
        double retencion = (sueldoBase + calcularPagoHE()) * (IRPF / 100);

        return retencion;
    }

    public double calculoNeto() {
        double salarioNeto = sueldoBase + calcularPagoHE() - retencionIRPF();

        return salarioNeto;
    }

    public String imprimirEmpleadoBasico() {
        return "NIF: " + NIF + ", sueldo: " + sueldoBase + ", esta casado: " + estaCasado + ", numero de hijos: " + numeroHijos;
    }

    public String imprimirEmpleado() {
        return "NIF: " + NIF + ", sueldo: " + sueldoBase + ", esta casado: " + estaCasado + ", numero de hijos: " + numeroHijos + ", sueldo extra: " + calcularPagoHE() + ", IRPF: " + retencionIRPF() + ", sueldo neto: " + calculoNeto(); 
    }
}
