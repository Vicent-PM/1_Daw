public interface MyCollection<T> {
    public void add(T element);

    public void remove(T element);

    public T get(Integer index);
}