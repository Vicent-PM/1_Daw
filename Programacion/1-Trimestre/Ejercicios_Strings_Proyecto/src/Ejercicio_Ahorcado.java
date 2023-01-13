import java.util.Scanner;

public class Ejercicio_Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la palabra a adivinar");
        String palabraAdivinar = scanner.nextLine();

        System.out.println("Empieza el juego");

        palabraAdivinar = palabraAdivinar.toLowerCase(); // Convertimos la palabra a minusculas
        char[] palabraChar = palabraAdivinar.toCharArray(); // Convertimos la palabra a un array de char
        char[] palabraResuelta = new char[palabraAdivinar.length()];
        int aciertos = 0;
        int fallos = 0;

        // Imprime tantas barras bajas como caracteres tiene la palabra
        for (int i = 0; i < palabraChar.length; i++) {
            System.out.print("_ ");
            palabraResuelta[i] = '_';
        }
        System.out.println("");

        boolean juego = true;

        // Bucle del juego (juego = false para salir)
        while (juego) {

            int contador = 0;
            // Pide la letra
            System.out.println("Introduce una letra");
            char letra = scanner.next().charAt(0);
            // Convertimos la letra a minsucula
            letra = Character.toLowerCase(letra);
            // Recorre el array y encuentra si esta la letra en la palabra
            for (int j = 0; j < palabraChar.length; j++) {
                if (palabraChar[j] == letra) {
                    palabraResuelta[j] = letra;
                    aciertos++;
                    contador++;
                }
            }

            System.out.print("La palabra es: ");
            System.out.println(palabraResuelta);
            // Si el contador es igual a 0 no se ha encontrado ninguna
            // palabra
            if (contador == 0) {
                fallos++;
                System.out.println("Has fallado tienes " + fallos + " fallos.");
            }
            // Si el numero de aciertos es igual a lo que mide la palabra, la palabra se ha
            // adivinado, se cierra el bucle
            if (aciertos == palabraChar.length) {
                System.out.println("Palabra adivinada.");
                juego = false;
            }
            // Si el numero de fallos es igual a 7 se ha superado el limite de intentos
            if (fallos == 7) {
                System.out.println("Has superado el limite de intentos, has perdido.");
                juego = false;
            }
        }
        scanner.close();
    }
}
