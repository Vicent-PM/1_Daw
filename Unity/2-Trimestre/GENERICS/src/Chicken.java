public class Chicken implements Animal{

    @Override
    public void eat() {
        System.out.println("The chicken eat");
    }

    @Override
    public void roar() {
        System.out.println("The chicken roar");
    }
    
    public void run(){
        System.out.println("El pollo corre");
    }
}
