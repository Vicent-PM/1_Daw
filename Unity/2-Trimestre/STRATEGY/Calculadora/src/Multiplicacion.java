import Interfaces.Operacion;

public class Multiplicacion implements Operacion {

    @Override
    public float execute(float ... terms) {
        float total = 0;
        for (float number : terms) {
            total *= number;
        };
        return total;
    }

}
