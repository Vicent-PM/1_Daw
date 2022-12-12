import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        ListaMultimedia lista = new ListaMultimedia(20);

        Disco disco1 = new Disco("M", "M", "MP3", 4, "Techno");
        Disco disco2 = new Disco("L", "L", "MP3", 3, "Reggae");
        Disco disco3 = new Disco("C", "C", "MP3", 6, "Rap");

        do {
            System.out.println("Menu");
            System.out.println("1. dameTamanio");
            System.out.println("2. Añadir los discos");
            System.out.println("3. getObjeto");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Salir");

            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    lista.dameTamanio();
                    break;
                case 2:
                    lista.addObjeto(disco1);
                    lista.addObjeto(disco2);
                    lista.addObjeto(disco3);
                    System.out.println("Discos añadidos");
                    break;
                case 3:
                    System.out.println("Introduce una posicion");
                    int pos = scanner.nextInt();

                    lista.getObjeto(pos).imprimir();
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
