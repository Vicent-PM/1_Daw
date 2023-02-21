import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArraySet<Integer> setInt = new ArraySet<Integer>();
        ArraySet<Integer> setInt2 = new ArraySet<Integer>();

        Iterator<Integer> it = setInt.iterator();

        setInt.add(5);
        setInt.add(2);
        setInt.add(2);
        setInt.add(3);
        setInt.add(6);
        setInt.add(8);
        setInt.add(1);
        setInt.add(9);
        setInt.add(55);
        setInt.add(3);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        setInt.remove(55);
        setInt.remove(6);

        System.out.println("\nDespues del remove");

        for (int i = 0; i < setInt.getPointer(); i++) {
            System.out.println(setInt.get(i));
        }

        setInt2.add(15);
        setInt2.add(22);
        setInt2.add(4);
        setInt2.add(6);
        setInt2.add(8);
        setInt2.add(1);
        setInt2.add(89);
        setInt2.add(55);
        setInt2.add(30);

        System.out.println("Array 2");
        for (int i = 0; i < setInt2.getPointer(); i++) {
            System.out.println(setInt2.get(i));
        }

        setInt.retainAll(setInt2);
        System.out.println("Despues de retainAll");
        for (int i = 0; i < setInt.getPointer(); i++) {
            System.out.println(setInt.get(i));
        }

    }
}
