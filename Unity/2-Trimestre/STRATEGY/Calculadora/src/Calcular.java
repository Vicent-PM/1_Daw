import Interfaces.Operacion;

public class Calcular {
    private Operacion calcular;

    public Calcular(Operacion calcular) {
        this.calcular = calcular;
    }

    public void setCalculo(Operacion calcular) {
        this.calcular = calcular;
    }

    public void calculo() {
        System.out.println("Haciendo la operacion");
        this.calcular.execute(6, 3);
        System.out.println("Operacion hecha");
    }
}
