package Ejercicio_2;


public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("53881357Q", 8, 0, 1300, 11.50, 5, false);

        System.out.println("El extra por las horas extras es " + empleado1.calcularPagoHE());
        System.out.println("La retencion es: " + empleado1.retencionIRPF());
        System.out.println("El salario neto es: " + empleado1.calculoNeto());
        System.out.println(empleado1.imprimirEmpleadoBasico());
        System.out.println(empleado1.imprimirEmpleado());
    }
}
