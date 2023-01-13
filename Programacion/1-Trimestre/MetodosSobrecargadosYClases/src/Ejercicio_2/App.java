package Ejercicio_2;

public class App {
    public static void main(String[] args) {
        Mascota perro = new Mascota("Rambo", "18/12/2015", true, "terrier", "Vicente", "Pedraza Montavez");

        System.out.println(perro.getNombreMascota() + ", " + perro.getFechaNacimiento() + ", " + perro.getTieneChip() + ", " + perro.getRaza() + ", " + perro.getNombreDueño() + ", " + perro.getApellidosDueño());

        perro.cambiarDatos("Maria", "Montavez Molina");
        perro.cambiarDatos("18/10/2015", false);
        System.out.println(perro.getNombreDueño() + ", " + perro.getApellidosDueño() + ", " + perro.getFechaNacimiento() + ", " + perro.getTieneChip());
        perro.cambiarDatos("Luna", "17/8/2020", false, "Bull", "Jose", "Montavez Sanchez");
        System.out.println(perro.getNombreMascota() + ", " + perro.getFechaNacimiento() + ", " + perro.getTieneChip() + ", " + perro.getRaza() + ", " + perro.getNombreDueño() + ", " + perro.getApellidosDueño());
    }
}
