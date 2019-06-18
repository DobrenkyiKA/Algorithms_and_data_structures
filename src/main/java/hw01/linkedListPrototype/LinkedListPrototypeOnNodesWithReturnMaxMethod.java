package hw01.linkedListPrototype;

public class LinkedListPrototypeOnNodesWithReturnMaxMethod<T extends Comparable> {

    private Node firstNode;

    private T maxValue;

    private int size = 0;

    public void addFirst(T element) {
        size++;
        Node node = new Node();
        node.currentElement = element;
        if (firstNode == null) {
            firstNode = node;
            maxValue = element;
        } else {
            if (maxValue.compareTo(element) < 0) {
                maxValue = element;
            }
            node.nextElement = firstNode;
            firstNode = node;
            node.nextElement.previousElement = firstNode;
        }
    }

    public void removeFirst() {
        if (firstNode != null) {
            size--;
            if (firstNode.nextElement != null) {
                firstNode = firstNode.nextElement;
                firstNode.previousElement = null;
            } else {
                firstNode = null;
                maxValue = null;
            }
        }
    }

    public int size() {
        return size;
    }

    public T head() {
        if (firstNode != null) {
            return (T)firstNode.currentElement;
        }
        return null;
    }

    public T returnMax() {
        return maxValue;
    }

    class Node <T>{
        Node previousElement;
        Node nextElement;
        T currentElement;
    }
}
