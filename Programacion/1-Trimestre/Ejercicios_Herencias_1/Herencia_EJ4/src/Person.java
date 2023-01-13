public class Person {
    private String nombre;
    private int edad, sexo;
    
    public Person(String nombre, int edad, int sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }


    public Person(){
        this.nombre = "Anonimo";
        this.edad = (int) (Math.random() * 17) + 8;
        this.sexo = (int) (Math.random() * 1) + 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    
}
