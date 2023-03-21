import Interfaces.Operacion;

public class App {
    public static void main(String[] args) throws Exception {
        Operacion resta = new Resta();
        Calcular calculadora = new Calcular(resta);

        float result = calculadora.calculo(50, 4, 10, 20, 9);
        System.out.println(result);
        calculadora.setCalculo(new Suma());
        System.out.println(calculadora.calculo(10, 4, 90, 10, 123));
    }
}
