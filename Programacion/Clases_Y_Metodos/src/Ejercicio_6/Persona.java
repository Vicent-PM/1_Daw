package Ejercicio_6;

import java.util.Random;

import Ejercicio_5.NIF;

public class Persona {
    private String nombre;
    private int edad;
    private NIF DNI;
    private char sexo;
    private double peso, altura;

    public Persona(String nombre, int edad, NIF DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public NIF generarDNI() {
        Random random = new Random();
        DNI = new NIF(random.nextInt(10000000, 99999999));
        return DNI;
    }

    public String imprimir() {
        return "Nombre: " + nombre + ", edad: " + edad + ", DNI: " + generarDNI().mostrarNIF() + ", sexo: " + sexo + ", peso: " + peso
                + "kg, altura: " + altura + "cm";
    }

}
