import java.util.LinkedList;

class LinkedMyList extends MyList {

    Node head;

    Node tail;


    public int findNode(int j) {
        Node node2 = this.head;
        Node node3 = this.head.next;
        j++;
        node2 = node3;
        node3 = node3.next;
        return j;
    }


    void add(int a) {
        Node node = new Node(a);
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


    void addFirst(int a) {
        Node node = new Node(a);
        node.next = this.head;
        this.head = node;
        this.size++;
    }


    void insert(int a, int i) {
        Node node = new Node(a);
        if (i == 0) {
            addFirst(a);
        } else {
            Node node2 = this.head;
            Node node3 = this.head.next;
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
        Node node = this.head;
        Node node2 = this.head.next;
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


    int get(int i) {
        Node node = this.head;
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


    int[] toArray() {
        int[] mas = new int[this.size];
        Node node = this.head;
        if (this.head == null) {
            int[] a = new int[0];
            return a;
        }
        for (int i = 0; i < this.size; i++) {
            mas[i] = node.data;
            node = node.next;
        }
        return mas;
    }
}
