package Ejercicio3;

public class App {
    public static void main(String[] args) {
        BarajaEs baEspañola = new BarajaEs();

        System.out.println("Has dado el: " + baEspañola.darCarta());
        if(baEspañola.hayCartas() == true){
            System.out.println("Si hay cartas");
        } else{
            System.out.println("No hay cartas");
        }

        baEspañola.imprimirBaraja();

        BarajaFr baFrancesa = new BarajaFr();

        System.out.println("Has dado el: " + baFrancesa.darCarta());

        if(baFrancesa.hayCartas() == true){
            System.out.println("Si hay cartas");
        } else{
            System.out.println("No hay cartas");
        }

        baFrancesa.imprimirBaraja();
        
    }
}
