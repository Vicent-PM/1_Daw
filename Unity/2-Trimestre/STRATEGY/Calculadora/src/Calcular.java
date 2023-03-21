import Interfaces.Operacion;

public class Calcular {
    private Operacion calcular;

    public Calcular(Operacion calcular) {
        this.calcular = calcular;
    }

    public void setCalculo(Operacion calcular) {
        this.calcular = calcular;
    }

    public float calculo(float ... terms) {
       return calcular.execute(terms);
    }
}
