public class MyArray<T> {

    private T[] array;
    private int pointer;

    public MyArray() {
        array = (T[]) new Object[50];
        pointer = -1;
    }

    public void add(T item) {
        if (pointer == array.length - 1) {
            resize();
        }
        array[++pointer] = item;
    }

    public T remove() {
        if (pointer < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T nBorrado = array[pointer--];
        return nBorrado;
    }

    private void resize() {
        T[] array2 = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
