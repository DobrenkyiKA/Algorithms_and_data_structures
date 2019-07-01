package hw03;

import hw01.LinkedListPrototypeOnNodes;

public class LinkedListPrototypeOnNodesWithReturnMaxMethod<T extends Comparable> {

    private Node firstNode;

    private LinkedListPrototypeOnNodes<T> maxValue = new LinkedListPrototypeOnNodes<>();

    private int size = 0;

    public void addFirst(T element) {
        size++;
        Node node = new Node();
        node.currentElement = element;
        if (firstNode == null) {
            firstNode = node;
            maxValue.addFirst(element);
        } else {
            if (maxValue.head().compareTo(element) <= 0) {
                maxValue.addFirst(element);
            }
            node.nextElement = firstNode;
            firstNode = node;
            node.nextElement.previousElement = firstNode;
        }
    }

    public void removeFirst() {
        if (firstNode != null) {
            size--;
            if (maxValue.head() == firstNode.currentElement) {
                maxValue.removeFirst();
            }
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
        return maxValue.head();
    }

    class Node <T>{
        Node previousElement;
        Node nextElement;
        T currentElement;
    }
}
