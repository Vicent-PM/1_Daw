import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DM[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int diaInt, mesInt, añoInt;
        int diaFin, mesFin, añoFin;

        System.out.println("Introduce el dia");
        diaInt = scanner.nextInt();
        System.out.println("Introduce el mes");
        mesInt = scanner.nextInt();
        System.out.println("Introduce el año");
        añoInt = scanner.nextInt();

        scanner.close();

        diaFin = diaInt;
        mesFin = mesInt;
        añoFin = añoInt;
        for(int i = 0; i < 100; i++){
            if((añoFin % 4 == 0) && ((añoFin % 100 != 0) || (añoFin % 400 == 0))){
                DM[2] = 29;
            }
            if (diaFin >= DM[mesFin] && mesFin == 12) {
                diaFin = 1;
                mesFin = 1;
                añoFin = añoFin + 1;
                System.out.println("La fecha es " + diaFin + "/" + mesFin + "/" + añoFin);
            } else if (diaFin >= DM[mesFin]) {
                diaFin = 1;
                mesFin = mesFin + 1;
                System.out.println("La fecha es " + diaFin + "/" + mesFin + "/" + añoFin);
            } else {
                diaFin = diaFin + 1;
                System.out.println("La fecha es " + diaFin + "/" + mesFin + "/" + añoFin);
            }
        }

    }
}
