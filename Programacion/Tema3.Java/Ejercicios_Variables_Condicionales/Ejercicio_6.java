package Ejercicios_Variables_Condicionales;

public class Ejercicio_6 {
    public static void main(String[] args) {
        double HFW = 69.99;
        double GTAV = 14.99;
        double pSuma = HFW + GTAV;
        double d20 = pSuma * 20 / 100;
        
        if ( d20 - 70 < 0){
            System.out.println("Si tienes para comprarlo");
        }
        else{
            System.out.println("No tienes para comprarlo");
        }
    }
}
