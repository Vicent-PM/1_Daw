import Interfaces.Strategy;

public class Bus implements Strategy {

    @Override
    public void execute() {
        System.out.println("Voy en bus");
    }

}
