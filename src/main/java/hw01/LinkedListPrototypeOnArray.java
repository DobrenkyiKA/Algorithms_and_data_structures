package hw01;

public class LinkedListPrototypeOnArray<T>  {

    private Object[] node;

    private int lastElement = -1;

    public LinkedListPrototypeOnArray() {
        node = new Object[16];
    }

    public LinkedListPrototypeOnArray(int capacity) {
        node = new Object[capacity];
    }

    public void addFirst(Object object) {
        if (node.length - 2 > lastElement) {
            node[++lastElement] = object;
        } else {
            resize();
            addFirst(object);
        }
    }

    public void removeFirst() {
        if (lastElement != -1) {
            node[lastElement] = null;
            lastElement--;
        }
    }

    public int size() {
        return lastElement + 1;
    }

    public T head() {
        if (lastElement == -1) {
            return null;
        }
        return (T) node[lastElement];
    }

    private void resize() {
        Object[] temp = new Object[node.length * 3 / 2 + 1];
        copy(node, temp);
        node = temp;
    }

    private void copy(Object[] old, Object[] newly) {
        for (int i = 0; i < old.length; i++) {
            newly[i] = old[i];
        }
    }

}
