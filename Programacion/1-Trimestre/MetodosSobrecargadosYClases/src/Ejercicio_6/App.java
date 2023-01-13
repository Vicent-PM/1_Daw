package Ejercicio_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehiculo coche1 = new Vehiculo("Ford", "Fiesta", "0000-XXX", "15/2/2010", "Blanco", "Diesel", new NIF(53881357),
                1200, 250, 4, 5, true);
        Vehiculo coche2 = new Vehiculo("Ford", "Focus", "0001-XXX", "15/2/2011", "Rojo", "Gasolina", new NIF(26227854),
                1200, 250, 4, 5, false);
        Vehiculo coche3 = new Vehiculo("Ford", "Ka", "0002-XXX", "15/2/2012", "Verde", "Gasolina", new NIF(53881758),
                1200, 250, 4, 5, true);
        Vehiculo coche4 = new Vehiculo("Nissan", "X-Trail", "0003-XXX", "15/2/2013", "Azul", "Gasolina",
                new NIF(57894564), 1200, 250, 4, 5, false);
        Vehiculo coche5 = new Vehiculo("Suzuki", "Vitara", "0004-XXX", "15/2/2014", "Amarillo", "Diesel",
                new NIF(25489575), 1200, 250, 4, 5, true);

        Vehiculo[] arrayVehiculos = { coche1, coche2, coche3, coche4, coche5 };

        for (int i = 0; i < arrayVehiculos.length; i++) {
            System.out.println("En el coche" + i + " vienen los pasajeros");
            String respuesta = scanner.nextLine();
            if (respuesta.startsWith("s") || respuesta.startsWith("S")) {
                arrayVehiculos[i].setHayPasajeros(true);
            } else {
                arrayVehiculos[i].setHayPasajeros(false);
            }
        }

        System.out.println("Descargar vehiculo");

        System.out.println("Introduce un dni");
        int dni = scanner.nextInt();

        for (int i = 0; i < arrayVehiculos.length; i++) {

            if (arrayVehiculos[i].getDni().getDNI() == dni) {
                arrayVehiculos[i].setEstaCargado(false);
                System.out.println("Vehiculo descargado");
                break;
            }
        }

        System.out.println("Cargar Vehiculo");

        System.out.println("Introduce un dni");
        dni = scanner.nextInt();

        for (int i = 0; i < arrayVehiculos.length; i++) {

            if (arrayVehiculos[i].getDni().getDNI() == dni) {
                arrayVehiculos[i].setEstaCargado(true);
                System.out.println("Vehiculo cargado");
            }
        }

        System.out.println("Imprimiendo datos");

        System.out.println("Introduce un dni");
        dni = scanner.nextInt();
        System.out.println("");
        for (int i = 0; i < arrayVehiculos.length; i++) {
            if (arrayVehiculos[i].getDni().getDNI() == dni) {
                System.out.println(arrayVehiculos[i].imprimirDatos());
            }
        }
        scanner.close();
    }
}
