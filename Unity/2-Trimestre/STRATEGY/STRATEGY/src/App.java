import Interfaces.Strategy;

public class App {
    public static void main(String[] args) throws Exception {
        
        Strategy bus = new Bus();
        MetodoDesplazamiento mtdDesplz = new MetodoDesplazamiento(bus);
        
        System.out.println("Compro billetes!");
        mtdDesplz.irAlAeropuerto();
        System.out.println("Estoy volando!");
    }
}
