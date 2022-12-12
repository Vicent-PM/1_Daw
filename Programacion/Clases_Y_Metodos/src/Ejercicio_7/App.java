package Ejercicio_7;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Vicente", "1", 1.5, 1500);
        Cuenta cuenta2 = new Cuenta("Alberto", "2", 2.2, 900);

        cuenta1.ingresar(50);
        cuenta2.ingresar(80);
        cuenta1.retirar(1000);
        cuenta2.retirar(2000);
        cuenta1.hacerTrasferencia(cuenta2, 350.55);
    }
}
