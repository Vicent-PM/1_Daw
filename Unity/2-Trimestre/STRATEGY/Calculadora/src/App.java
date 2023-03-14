import Interfaces.Operacion;

public class App {
    public static void main(String[] args) throws Exception {
        Operacion suma = new Suma();
        Operacion resta = new Resta();
        
        Operacion multiplicacion = new Multiplicacion();
        Operacion division = new Division();

        Calcular calcular = new Calcular(division);

        calcular.calculo();
    }
}
