package hw02;

import hw01.LinkedListPrototypeOnNodes;

public class QueueOnLinkedListPrototype<T> {

    private LinkedListPrototypeOnNodes<T> linkedListPrototypeOnNodes1;
    private LinkedListPrototypeOnNodes<T> linkedListPrototypeOnNodes2;

    public QueueOnLinkedListPrototype() {
        linkedListPrototypeOnNodes1 = new LinkedListPrototypeOnNodes<>();
        linkedListPrototypeOnNodes2 = new LinkedListPrototypeOnNodes<>();
    }

    public void addFirst(T element) {
        linkedListPrototypeOnNodes1.addFirst(element);
    }

    public void removeLast() {
        replace(linkedListPrototypeOnNodes1, linkedListPrototypeOnNodes2);
        linkedListPrototypeOnNodes2.removeFirst();
        replace(linkedListPrototypeOnNodes2, linkedListPrototypeOnNodes1);
    }

    public T head() {
        return linkedListPrototypeOnNodes1.head();
    }

    public T tail() {
        linkedListPrototypeOnNodes2 = new LinkedListPrototypeOnNodes<>();
        replace(linkedListPrototypeOnNodes1, linkedListPrototypeOnNodes2);
        T head = linkedListPrototypeOnNodes2.head();
        replace(linkedListPrototypeOnNodes2, linkedListPrototypeOnNodes1);
        return head;
    }

    public int size() {
        return linkedListPrototypeOnNodes1.size();
    }

    private void replace(LinkedListPrototypeOnNodes first, LinkedListPrototypeOnNodes second) {

        for (int i = 0; i < first.size();) {
            second.addFirst(first.head());
            first.removeFirst();
        }
    }
}
