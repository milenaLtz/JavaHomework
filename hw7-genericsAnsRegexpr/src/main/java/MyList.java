public abstract class MyList<T> {

    int size;


    abstract void add(T a);

    abstract void addFirst(T a);

    abstract void insert(T a, int i);

    abstract void delete(int i);

    abstract T get(int i);

    int size() {
        return this.size;
    }

    abstract T[] toArray(T array);

}
