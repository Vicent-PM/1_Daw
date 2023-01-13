package Ejercicio_8;

public class Fecha {
    private int dia, mes, año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean fechaCorrecto() {
        if(dia > 31 || mes > 12 || año < 0){
            return false;
        } else if((dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) ){
            return false;
        } else if ((dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))){
            return false;
        } else if(mes == 2 && dia > 28){
            return false;
        } else{
            return true;
        }
    }

    public void diaSiguiente() {
        if(fechaCorrecto()){
            if((dia < 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) ||  (dia < 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || mes == 2 && dia < 28){
                dia += 1;
            } else {
                if(mes == 12 && dia == 31){
                    año += 1;
                    dia = 1;
                    mes = 1;
                } else{
                    dia = 1;
                    mes += 1;
                }
                
            }
        }
    }

    public void imprimirFecha() {
        System.out.println("La fecha de mañana sera " + dia + "/" + mes + "/" + año);
    }
}
