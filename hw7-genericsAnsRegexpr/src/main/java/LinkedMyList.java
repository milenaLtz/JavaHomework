import java.lang.reflect.Array;

public class LinkedMyList<T> extends MyList<T> {

    Node<T> head;

    Node<T> tail;

    public int findNode(int j) {
        Node<T> node2 = this.head;
        Node<T> node3 = this.head.next;
        j++;
        node2 = node3;
        node3 = node3.next;
        return j;
    }

    void add(T a) {
        Node<T> node = new Node(a);
        if (this.head == null) {
            this.head = node;
            node.next = null;
        }
        if (this.tail == null) {
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = this.tail.next;
            this.tail.next = null;
        }
        this.size++;
    }

    void addFirst(T a) {
        Node<T> node = new Node(a);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    void insert(T a, int i) {
        Node<T> node = new Node(a);
        if (i == 0) {
            addFirst(a);
        } else {
            Node<T> node2 = this.head;
            Node<T> node3 = this.head.next;
            int j = 1;
            while (j < i) {
                findNode(j);
            }
            node2.next = node;
            node.next = node3;
            this.size++;
        }
    }

    void delete(int i) {
        Node<T> node = this.head;
        Node<T> node2 = this.head.next;
        int j = 1;
        if (i == 0) {
            this.head = this.head.next;
        } else {
            while (j < i) {
                j++;
                node = node2;
                node2 = node2.next;
            }
            node = null;
        }
        this.size--;
    }

    public T get(int i) {
        Node<T> node = this.head;
        if (i == 0) {
            return this.head.data;
        } else if (i == this.size) {
            return this.tail.data;
        }
        int j = 1;
        while (j < i) {
            j++;
            node = node.next;
        }
        return node.data;
    }

    int size() {
        return super.size();
    }

    T[] toArray(T array) {
        T[] answer = (T[]) Array.newInstance(array.getClass().getComponentType(), this.size);
        Node<T> node = this.head;
        if (this.head == null) {
            T[] ans = (T[]) Array.newInstance(array.getClass().getComponentType(), 0);
            return ans;
        }
        for (int i = 0; i < this.size; i++) {
            answer[i] = node.data;
            node = node.next;
        }
        return answer;
    }

}
