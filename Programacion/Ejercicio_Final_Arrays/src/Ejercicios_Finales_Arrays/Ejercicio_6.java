public class Ejercicio_6 {

    public static void main(String[] args) {

        String bombo1[][] = {
                { "Qatar", "Bélgica", "Brasil", "Francia", "Argentina", "Inglaterra", "España", "Portugal" },
                { "Dinamarca", "Países Bajos", "Alemania", "México", "Estados Unidos", "Suiza", "Croacia", "Uruguay" },
                { "Senegal", "Irán", "Japón", "Marruecos", "Serbia", "Polonia", "Corea del Sur", "Túnez" },
                { "Canadá", "Ghana", "Camerún", "Arabia Saudí", "Ecuador", "Gales", "Costa Rica", "Australia" } };

        String grupo1[][] = new String[8][4];
        int aleatorio[] = new int[8];

        sacarAleatorio(aleatorio);
        for (int i = 0; i < grupo1.length; i++) {
            for (int j = 0; j < grupo1[i].length; j++) {
                grupo1[i][j] = bombo1[j][aleatorio[i]];
            }

        }

        // Para leer los arrays

        for (int i = 0; i < grupo1.length; i++) {
            System.out.print("El grupo " + (i + 1) + " es ");
            for (int j = 0; j < grupo1[i].length; j++) {
                System.out.print(grupo1[i][j] + ", ");
            }
            System.out.println("");
        }

    }
    public static int[] sacarAleatorio(int aleatorio[]) {
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * aleatorio.length);
            for (int j = 0; j < i; j++) {
                if (aleatorio[i] == aleatorio[j]) {
                    i--;
                }
            }
        }
        return aleatorio;
    }
}
