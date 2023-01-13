public class Ejercicio_5 {
    public static void main(String[] args) {
        char arrayChar[] = new char[26];
        char cont = 65;

        for (char i = 0; i < 26; i++) {
            arrayChar[i] = cont;
            cont += 1;
            System.out.println(arrayChar[i]);
        }
    }
}
