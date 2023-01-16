package Ejercicio_3;

import java.util.Random;

public class Password {
    private int tamaño;
    private String contraseña;

    public Password() {
        this.tamaño = 8;
        this.contraseña = generarPassword();
    }

    public Password(int tamaño) {
        this.tamaño = tamaño;
        this.contraseña = generarPassword();
    }

    public String generarPassword() {
        Random random = new Random();
        this.contraseña = "";
        for (int i = 0; i < this.tamaño; i++) {
            contraseña += (char) random.nextInt(33,122);
        }
        return contraseña;
    }

    public boolean esFuerte() {
        for (int i = 0; i < contraseña.length(); i++) {
            char charAComprobar = contraseña.charAt(i);
            boolean hayMayuscula = Character.isUpperCase(charAComprobar);
            if (hayMayuscula && this.tamaño > 7) {
                return true;
            }
        }
        return false;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void cambiarContraseña(int tamaño, String contraseña) {
        this.tamaño = tamaño;
        this.contraseña = contraseña;
    }

    public void cambiarContraseña(int tamaño) {
        this.tamaño = tamaño;
        this.contraseña = generarPassword();
    }
}
