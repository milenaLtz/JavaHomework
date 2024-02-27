public class StrangeMyList {
    public static LinkedMyList getStrangeList() {
        LinkedMyList myList = new LinkedMyList() {
            @Override
            void add(int a) {
                Node node = new Node(a);
                if (a % 2 == 0) {
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
            }

            @Override
            void addFirst(int a) {
                Node node = new Node(a);
                if (a % 2 == 0) {
                    node.next = this.head;
                    this.head = node;
                    this.size++;
                }
            }

            @Override
            void insert(int a, int i) {
                Node node = new Node(a);
                if (a % 2 == 0) {
                    if (i == 0) {
                        addFirst(a);
                    } else {
                        Node node2 = this.head;
                        Node node3 = this.head.next;
                        int j = 1;
                        while (j < i) {
                            j++;
                            node2 = node3;
                            node3 = node3.next;
                        }
                        node2.next = node;
                        node.next = node3;
                        this.size++;
                    }

                }
            }

            @Override
            void delete(int i) {
                Node node = this.head;
                Node node2 = this.head.next;
                int j = 1;
                if (i == 0 && node.data % 3 == 0 || i == 0 && node.data % 5 == 0) {
                    this.head = this.head.next;
                } else {
                    while (j < i) {
                        j++;
                        node = node2;
                        node2 = node2.next;
                    }
                    if (node2.data % 3 == 0 || node2.data % 5 == 0) {
                        node.next = node2.next;
                        this.size--;
                    }
                }
            }

            @Override
            int get(int i) {
                return super.get(i);
            }

            @Override
            int size() {
                return super.size();
            }

            @Override
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
        };
        return myList;
    }
}
