import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero");
        numero = scanner.nextInt();

        scanner.close();

        if (numero >= 1 && numero <= 3999) {
            String a = "z";
            String b = "z";
            String c = "z";
            String d = "z";

            int n1 = (numero / 1000) % 10;
            int n2 = (numero / 100) % 10;
            int n3 = (numero / 10) % 10;
            int n4 = numero % 10;

            if (n1 <= 3) {
                switch (n1) {
                    case 1:
                        a = "M";
                        break;
                    case 2:
                        a = "MM";
                        break;
                    case 3:
                        a = "MMM";
                        break;
                }
            }
            if (n2 <= 9) {
                switch (n2) {
                    case 1:
                        b = "C";
                        break;
                    case 2:
                        b = "CC";
                        break;
                    case 3:
                        b = "CCC";
                        break;
                    case 4:
                        b = "CD";
                        break;
                    case 5:
                        b = "D";
                        break;
                    case 6:
                        b = "DC";
                        break;
                    case 7:
                        b = "DCC";
                        break;
                    case 8:
                        b = "DCCC";
                        break;
                    case 9:
                        b = "CM";
                        break;
                }
            }
            if (n3 <= 9) {
                switch (n3) {
                    case 1:
                        c = "X";
                        break;
                    case 2:
                        c = "XX";
                        break;
                    case 3:
                        c = "XXX";
                        break;
                    case 4:
                        c = "XL";
                        break;
                    case 5:
                        c = "L";
                        break;
                    case 6:
                        c = "LX";
                        break;
                    case 7:
                        c = "LXX";
                        break;
                    case 8:
                        c = "LXXX";
                        break;
                    case 9:
                        c = "XC";
                        break;
                }
            }
            if (n4 <= 9) {
                switch (n4) {
                    case 1:
                        d = "I";
                        break;
                    case 2:
                        d = "II";
                        break;
                    case 3:
                        d = "III";
                        break;
                    case 4:
                        d = "IV";
                        break;
                    case 5:
                        d = "V";
                        break;
                    case 6:
                        d = "VI";
                        break;
                    case 7:
                        d = "VII";
                        break;
                    case 8:
                        d = "VIII";
                        break;
                    case 9:
                        d = "IX";
                        break;
                }
            }

            System.out.println(a + b + c + d);
        }
        else{
            System.out.println("No se puede hacer");
        }

    }
}
