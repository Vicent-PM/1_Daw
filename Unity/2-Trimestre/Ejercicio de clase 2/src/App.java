public class App {
    public static void main(String[] args) {

        MyArray<Integer> myArray = new MyArray<>();

        myArray.add(3);
        myArray.add(33333);
        myArray.add(57);
        
        System.out.println("Elemento eliminado: " + myArray.remove());
        System.out.println("Elemento eliminado: " + myArray.remove());
        System.out.println("Elemento eliminado: " + myArray.remove());
    }
}
