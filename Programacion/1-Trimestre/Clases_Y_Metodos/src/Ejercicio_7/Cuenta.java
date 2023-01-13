package Ejercicio_7;

public class Cuenta {
    private String nombreCliente, numeroCuenta;
    private double tipoInteres, saldo;

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public void ingresar(double Saldo_A_Ingresar) {
        if (Saldo_A_Ingresar < 0) {
            System.out.println("La cantidad no puede ser negativa");
        } else {
            saldo += Saldo_A_Ingresar;
            System.out.println("Total de saldo: " + saldo);
        }
    }

    public void retirar(double Saldo_A_Retirar) {
        if (Saldo_A_Retirar < 0) {
            System.out.println("La cantidad no puede ser negativa");
        } else if (Saldo_A_Retirar > saldo) {
            System.out.println("No dispone de suficiente saldo para retirar esa cantidad");
        } else {
            saldo -= Saldo_A_Retirar;
            System.out.println("Total de saldo: " + saldo);
        }
    }

    public void hacerTrasferencia(Cuenta cuentaDestino, double cantidad) {
        this.saldo -= cantidad;
        cuentaDestino.saldo += cantidad;
        System.out.println("Se han añadido " + cantidad + " euros a la cuenta " + cuentaDestino.numeroCuenta);
    }
}
