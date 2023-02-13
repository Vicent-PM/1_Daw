public class MyArray<T> {

    private int tam;
    private T[] arrayT;
    private int pointer;

    public MyArray() {
        tam = 50;
        arrayT = (T[]) new Object[tam];
        pointer = -1;
    }

    public void add(T element) {
        if (pointer == arrayT.length - 1) {
            resize(tam * 2);
        }
        pointer++;
        arrayT[pointer] = element;
    }

    public T remove() {
        if (pointer == -1) {
            return null;
        }
        T element = arrayT[pointer];
        pointer--;
        if (pointer < tam / 4) {
            resize(tam / 2);
        }
        return element;
    }

    private void resize(int tam2) {
        T[] aResize = (T[]) new Object[tam2];
        for (int i = 0; i <= pointer; i++) {
            aResize[i] = arrayT[i];
        }
        arrayT = aResize;
        tam = tam2;
    }
}