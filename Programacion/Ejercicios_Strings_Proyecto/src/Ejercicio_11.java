import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la url de una web");
        String urlWeb = scanner.nextLine();

        boolean esCorrecto;

        if (urlWeb.startsWith("https://")) {
            esCorrecto = true;
        } else if (urlWeb.startsWith("http://")) {
            urlWeb = urlWeb.replaceAll("http://", "https://");
            esCorrecto = true;
        }
        else{
            urlWeb = urlWeb.replaceAll(urlWeb, "https://" + urlWeb);
            esCorrecto = true;
        }

        if(esCorrecto){
            System.out.println(urlWeb);
        }

        scanner.close();
    }
}
