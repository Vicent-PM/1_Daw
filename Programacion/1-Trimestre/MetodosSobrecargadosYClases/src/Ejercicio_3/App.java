package Ejercicio_3;

public class App {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Vilches F.C.", "Vilches", 16, 12, 3);
        Equipo equipo2 = new Equipo("Arquillos F.C", "Arquillos");

        equipo1.partido("ganado");
        equipo1.partido("ganado", 3);
        equipo2.partido("perdido", 0, 7);

    }
}
