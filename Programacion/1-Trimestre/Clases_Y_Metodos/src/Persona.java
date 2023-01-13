public class Persona {
    
    private String nombre, apellidos, dni, direccion;
    private double salario;

    public Persona(String nombre, String apellidos, String dni, String direccion, double salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.salario = salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUsuario(){
        return this.nombre + ", " + this.apellidos + ", " + this.direccion;
    }

    public void meterDinero(double dinero){
        this.salario = salario + dinero;
    }

    public Double dimeSaldo() {
        return this.salario;
    }

    public boolean sacarDinero(double dinero) {
        if(this.salario >= dinero){
            this.salario -= dinero;
            return true;
        }else{
            return false;
        }   
    }

}
