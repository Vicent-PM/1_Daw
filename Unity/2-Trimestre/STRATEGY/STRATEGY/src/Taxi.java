import Interfaces.Strategy;

public class Taxi implements Strategy {

    @Override
    public void execute() {
        System.out.println("Voy en taxi");
    }

}
