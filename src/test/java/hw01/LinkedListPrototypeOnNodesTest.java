package hw01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListPrototypeOnNodesTest {

    @Test
    void addFirst() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(150, linkedListPrototypeOnNodes.head());
    }

    @Test
    void removeFirst() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(100);
        linkedListPrototypeOnNodes.removeFirst();
        assertEquals(150, linkedListPrototypeOnNodes.head());
        linkedListPrototypeOnNodes.removeFirst();
        assertNull(linkedListPrototypeOnNodes.head());
    }

    @Test
    void size() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(5, linkedListPrototypeOnNodes.size());
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(8, linkedListPrototypeOnNodes.size());
        linkedListPrototypeOnNodes.removeFirst();
        linkedListPrototypeOnNodes.removeFirst();
        linkedListPrototypeOnNodes.removeFirst();
        linkedListPrototypeOnNodes.removeFirst();
        assertEquals(4, linkedListPrototypeOnNodes.size());
    }

    @Test
    void head() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(150, linkedListPrototypeOnNodes.head());
        assertEquals(150, linkedListPrototypeOnNodes.head());
        assertEquals(150, linkedListPrototypeOnNodes.head());
        assertEquals(150, linkedListPrototypeOnNodes.head());
    }

    @Test
    void capacity() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        assertEquals(0, linkedListPrototypeOnNodes.size());
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(1, linkedListPrototypeOnNodes.size());
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(2, linkedListPrototypeOnNodes.size());
        linkedListPrototypeOnNodes.addFirst(150);
        assertEquals(3, linkedListPrototypeOnNodes.size());
        assertEquals(150, linkedListPrototypeOnNodes.head());
    }
    @Test
    void resize() {
        LinkedListPrototypeOnNodes<Integer> linkedListPrototypeOnNodes = new LinkedListPrototypeOnNodes<>();
        for (int i = 0; i < 1000000; i++) {
            linkedListPrototypeOnNodes.addFirst(150);
        }
        assertEquals(1_000_000, linkedListPrototypeOnNodes.size());
    }
}