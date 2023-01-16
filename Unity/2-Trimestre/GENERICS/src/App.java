import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ArrayList");
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Hola");
        Collections.sort(ls);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Chicken());
        animalList.add(new Pig());

        for (Animal animal : animalList) {
            animal.eat();
            animal.roar();
            if (animal instanceof Pig) {
                ((Pig) animal).jump();
            }
            if (animal instanceof Chicken) {
                ((Chicken) animal).run();
            }
        }

        // System.out.println("\nHASHSET");
        // Set<Integer> set1 = new HashSet<Integer>();
        // set1.add(2);
        // set1.add(3);
        // set1.add(3);
        // set1.add(1);

        // System.out.println("Set 1: ");
        // for (Integer integer : set1) {
        //     System.out.println(integer);
        // }

        // Set<Integer> set2 = new HashSet<Integer>();
        // set2.add(2);
        // set2.add(10);
        // set2.add(4);
        // set2.add(1);

        // System.out.println("Set 2: ");
        // for (Integer integer : set2) {
        //     System.out.println(integer);
        // }

        // set1.addAll(set2);

        // System.out.println("Set 1 Union Set 2: ");
        // for (Integer integer : set1) {
        //     System.out.println(integer);
        // }

        // set1.retainAll(set2);

        // System.out.println("Set 1 Intersection Set 2: ");
        // for (Integer integer : set1) {
        //     System.out.println(integer);
        // }

        // set1.removeAll(set2);

        // System.out.println("Set 1 - Set 2: ");
        // for (Integer integer : set2) {
        //     System.out.println(integer);
        // }
    }
}
