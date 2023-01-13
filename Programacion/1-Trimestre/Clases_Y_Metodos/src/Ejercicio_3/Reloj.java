package Ejercicio_3;

public class Reloj {
    
    private int horas, minutos, segundos;

    public Reloj(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String mostrarHora() {
        return horas + "." + minutos + ":" + segundos;
    }

    public String mostrarHoraFormato(int formato) {
        String horasForm = "";
        if(horas > 12 && formato == 12){
            horasForm = (horas - 12) + ":" + minutos + ":" + segundos + " pm";
        } else if(formato == 12){
            horasForm = horas + ":" + minutos + ":" + segundos + " am";
        } else if(formato == 24){
            horasForm = horas + ":" + minutos + ":" + segundos;
        }
        return horasForm;
    }
}
