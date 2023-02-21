public interface MySet<T> extends MyCollection<T> {
    void retainAll(MySet<T> conjunto);

    void addAll(MySet<T> conjunto);
}