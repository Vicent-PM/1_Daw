import java.util.Iterator;

public class JavaIterable implements Iterable<Integer> {

    private Integer[] JavaIntegerArray;

    public JavaIterable(Integer[] javaIntegerArray){
        JavaIntegerArray = javaIntegerArray;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new JavaIterator();
        return it;
    }

    private class JavaIterator implements Iterator<Integer> {
        private int arrayPos = 0;

        @Override
        public boolean hasNext() {
            return arrayPos != JavaIntegerArray.length;
        }
    
        @Override
        public Integer next() {
            return JavaIntegerArray[arrayPos++];
        }
        
    }
    
}
