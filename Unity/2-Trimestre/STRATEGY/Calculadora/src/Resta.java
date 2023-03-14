import Interfaces.Operacion;

public class Resta implements Operacion {

    @Override
    public void execute(float a, float b) {
        System.out.println(a - b);
    }

}
