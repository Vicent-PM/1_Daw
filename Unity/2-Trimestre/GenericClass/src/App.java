import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        GenericClass<Integer> intClass = new GenericClass<Integer>(3);
        GenericClass<String> stringClass = new GenericClass<String>("hello");

        ArrayList<String> listString = new ArrayList<>();

        EjemploNoGeneric ejemplo = new EjemploNoGeneric();
        ejemplo.metodoGeneric(true);

        String element = EjemploNoGeneric.addAndReturn("texto", listString);
        // System.out.println(element);

        // System.out.println(intClass.getElement());
        // System.out.println(stringClass.getElement());

        Integer[] numberArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        JavaIterable iterable = new JavaIterable(numberArray);
        for (Integer integer : iterable) {
            System.out.println(integer);
        }
    }
}
