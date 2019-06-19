package hw01.linkedListPrototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListPrototypeOnArrayTest {

    @Test
    void addFirst() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray();
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(150, linkedListPrototypeOnArray.head());
    }

    @Test
    void removeFirst() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray();
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(100);
        linkedListPrototypeOnArray.removeFirst();
        assertEquals(150, linkedListPrototypeOnArray.head());
        linkedListPrototypeOnArray.removeFirst();
        assertNull(linkedListPrototypeOnArray.head());
    }

    @Test
    void size() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray();
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(5, linkedListPrototypeOnArray.size());
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(8, linkedListPrototypeOnArray.size());
        linkedListPrototypeOnArray.removeFirst();
        linkedListPrototypeOnArray.removeFirst();
        linkedListPrototypeOnArray.removeFirst();
        linkedListPrototypeOnArray.removeFirst();
        assertEquals(4, linkedListPrototypeOnArray.size());
    }

    @Test
    void head() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray();
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(150, linkedListPrototypeOnArray.head());
        assertEquals(150, linkedListPrototypeOnArray.head());
        assertEquals(150, linkedListPrototypeOnArray.head());
        assertEquals(150, linkedListPrototypeOnArray.head());
    }

    @Test
    void capacity() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray(2);
        assertEquals(0, linkedListPrototypeOnArray.size());
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(1, linkedListPrototypeOnArray.size());
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(2, linkedListPrototypeOnArray.size());
        linkedListPrototypeOnArray.addFirst(150);
        assertEquals(3, linkedListPrototypeOnArray.size());
        assertEquals(150, linkedListPrototypeOnArray.head());
    }
    @Test
    void resize() {
        LinkedListPrototypeOnArray linkedListPrototypeOnArray = new LinkedListPrototypeOnArray(2);
        for (int i = 0; i < 1000000; i++) {
            linkedListPrototypeOnArray.addFirst(150);
        }
        assertEquals(1_000_000, linkedListPrototypeOnArray.size());
    }
}