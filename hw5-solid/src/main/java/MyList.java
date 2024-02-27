import java.util.LinkedList;

abstract class MyList {
    int size;

    abstract void add(int a);

    abstract void addFirst(int a);

    abstract void insert(int a, int i);

    abstract void delete(int i);

    abstract int get(int i);


    int size() {
        return this.size;
    }

    ;

    abstract int[] toArray();

}
