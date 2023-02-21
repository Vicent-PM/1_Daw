import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArraySet<T> implements MySet<T> {
    private static final int tamanio = 50;

    private T[] elements;
    private int pointer;

    public ArraySet() {
        this.elements = (T[]) new Object[tamanio];
        this.pointer = 0;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public void add(T element) {
        if (!contains(element)) {
            if (pointer == elements.length) {
                resize();
            }
            elements[pointer] = element;
            pointer++;
        }
    }

    private boolean contains(T element) {
        for (int i = 0; i < pointer; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < pointer; i++) {
            if (elements[i].equals(element)) {
                pointer--;
                elements[i] = elements[pointer];
                elements[pointer] = null;
                break;
            }
        }
    }

    @Override
    public T get(Integer index) {
        if (index < 0 || index >= pointer) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public void addAll(MySet<T> conjunto) {
        for (T element : elements) {
            add(element);
        }
    }

    @Override
    public void retainAll(MySet<T> conjunto) {
        ArraySet<T> setTemp = new ArraySet<T>();
        for (int i = 0; i < this.pointer; i++) {
            if (contains(this.elements[i])) {
                setTemp.add(this.elements[i]);
            }
        }
        this.elements = setTemp.elements;
        this.pointer = setTemp.pointer;
    }

    public Iterator<T> iterator() {
        return new MyArrayIterator();
    }

    private class MyArrayIterator implements Iterator<T> {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < pointer;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[currentIndex++];
        }
    }

    public static int getTamanio() {
        return tamanio;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public int getPointer() {
        return pointer;
    }
}
