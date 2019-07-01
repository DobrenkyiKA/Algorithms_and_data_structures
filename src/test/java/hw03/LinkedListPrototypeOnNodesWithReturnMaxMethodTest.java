package hw03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListPrototypeOnNodesWithReturnMaxMethodTest {

    @Test
    void addFirst() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
    }

    @Test
    void removeFirst() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(100);
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        assertNull(linkedListPrototypeOnNodesWithReturnMaxMethod.head());
    }

    @Test
    void size() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(5, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(8, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        linkedListPrototypeOnNodesWithReturnMaxMethod.removeFirst();
        assertEquals(4, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
    }

    @Test
    void head() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
    }

    @Test
    void capacity() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        assertEquals(0, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(1, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(2, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        assertEquals(3, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
        assertEquals(150, linkedListPrototypeOnNodesWithReturnMaxMethod.head());
    }
    @Test
    void resize() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        for (int i = 0; i < 1000000; i++) {
            linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(150);
        }
        assertEquals(1_000_000, linkedListPrototypeOnNodesWithReturnMaxMethod.size());
    }

    @Test
    void returnMax() {
        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(1);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(10);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(100);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(100);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(10);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(1);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(9999);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(199);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(1656464);
        linkedListPrototypeOnNodesWithReturnMaxMethod.addFirst(-999);
        assertEquals(1656464, linkedListPrototypeOnNodesWithReturnMaxMethod.returnMax());

        LinkedListPrototypeOnNodesWithReturnMaxMethod<String> linkedListPrototypeOnNodesWithReturnMaxMethod1 = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("a");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("b");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("c");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("d");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("c");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("b");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("a");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("afdgfhf");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("432432fdsfs");
        linkedListPrototypeOnNodesWithReturnMaxMethod1.addFirst("");
        assertEquals("d", linkedListPrototypeOnNodesWithReturnMaxMethod1.returnMax());

        LinkedListPrototypeOnNodesWithReturnMaxMethod<Integer> linkedListPrototypeOnNodesWithReturnMaxMethod2 = new LinkedListPrototypeOnNodesWithReturnMaxMethod<>();
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(1);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(10);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(100);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(100);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(10);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(1);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(9999);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(199);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(1656464);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.addFirst(-999);
        linkedListPrototypeOnNodesWithReturnMaxMethod2.removeFirst();
        linkedListPrototypeOnNodesWithReturnMaxMethod2.removeFirst();
        assertEquals(9999, linkedListPrototypeOnNodesWithReturnMaxMethod2.returnMax());

    }
}