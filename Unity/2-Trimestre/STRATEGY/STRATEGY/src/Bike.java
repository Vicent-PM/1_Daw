import Interfaces.Strategy;

public class Bike implements Strategy {

    @Override
    public void execute() {
        System.out.println("Voy en bici");
    }

}
