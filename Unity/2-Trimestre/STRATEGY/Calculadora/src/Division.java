import Interfaces.Operacion;

public class Division implements Operacion {

    @Override
    public void execute(float a, float b) {
        System.out.println(a / b);
    }

}
