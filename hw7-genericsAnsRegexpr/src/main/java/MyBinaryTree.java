import java.lang.reflect.Array;

public class MyBinaryTree<T extends Number> {

    T data;

    MyBinaryTree<T> left;

    MyBinaryTree<T> right;

    int size;


    boolean contains(T data) {
        if (this.data == null) {
            return false;
        } else {
            if (this.data.doubleValue() == data.doubleValue()) {
                return true;
            } else {
                if (this.data.doubleValue() < data.doubleValue()) {
                    if (this.left != null) {
                        return this.left.contains(data);
                    } else {
                        return false;
                    }
                } else {
                    if (this.right != null) {
                        return this.right.contains(data);
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    void add(T data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (this.data.doubleValue() >= data.doubleValue()) {
                if (this.right != null) {
                    this.right.add(data);
                } else {
                    this.right = new MyBinaryTree<>();
                    this.right.data = data;
                }
            } else {
                if (this.left != null) {
                    this.left.add(data);
                } else {
                    this.left = new MyBinaryTree<>();
                    this.left.data = data;
                }
            }
        }
        size++;
    }


    public MyBinaryTree<T> delete(T data) {
        return helpToDelete(this, data);
    }

    private MyBinaryTree<T> helpToDelete(MyBinaryTree<T> current, T data) {
        if (current == null) {
            return null;
        }
        if (data.doubleValue() == current.data.doubleValue()) {
            if (current.left == null && current.right == null) {
                size--;
                return null;
            }
            if (current.right == null) {
                size--;
                return current.left;
            }
            if (current.left == null) {
                size--;
                return current.right;
            }
            T smallestD = smallest(current.left);
            current.data = smallestD;
            current.left = helpToDelete(current.left, smallestD);
            return current;
        }
        if (data.doubleValue() < current.data.doubleValue()) {
            current.right = helpToDelete(current.right, data);
            return current;
        }
        current.left = helpToDelete(current.left, data);
        return current;
    }

    private T smallest(MyBinaryTree<T> item) {
        if (item.right == null) {
            return item.data;
        } else {
            return smallest(item.right);
        }
    }


    int size() {
        return this.size;
    }

    T[] toArray(T[] array) {
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), this.size);
        if (newArray.length == 0) {
            return newArray;
        }
        helpMethod(this, newArray, 0);
        return newArray;
    }

    private void helpMethod(MyBinaryTree<T> current, T[] array, int i) {
        array[i] = current.data;
        if (current.right != null) {
            if (2 * i + 1 < array.length) {
                helpMethod(current.right, array, 2 * i + 1);
            } else if (2 * i + 1 >= array.length) {
                int index = array.length;
                while (array[index - 1] != null) {
                    index--;
                }
                helpMethod(current.right, array, index - 1);
            }
        }
        if (current.left != null) {
            if (2 * (i + 1) < array.length) {
                helpMethod(current.left, array, 2 * (i + 1));
            } else if (2 * (i + 1) >= array.length) {
                int index = array.length;
                while (array[index - 1] != null) {
                    index--;
                }
                helpMethod(current.left, array, index - 1);
            }
        }
    }
}



