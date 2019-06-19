package hw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueOnLinkedListPrototypeTest {

    @Test
    void addFirst() {
        QueueOnLinkedListPrototype<String> queueOnLinkedListPrototype = new QueueOnLinkedListPrototype<>();
        queueOnLinkedListPrototype.addFirst("1");
        queueOnLinkedListPrototype.addFirst("2");
        queueOnLinkedListPrototype.addFirst("3");
        queueOnLinkedListPrototype.addFirst("4");
        queueOnLinkedListPrototype.addFirst("5");
        assertEquals(5, queueOnLinkedListPrototype.size());
        assertEquals("5", queueOnLinkedListPrototype.head());
        assertEquals("1", queueOnLinkedListPrototype.tail());

    }

    @Test
    void removeLast() {
        QueueOnLinkedListPrototype<String> queueOnLinkedListPrototype = new QueueOnLinkedListPrototype<>();
        queueOnLinkedListPrototype.addFirst("1");
        queueOnLinkedListPrototype.addFirst("2");
        queueOnLinkedListPrototype.addFirst("3");
        queueOnLinkedListPrototype.addFirst("4");
        queueOnLinkedListPrototype.addFirst("5");
        queueOnLinkedListPrototype.removeLast();
        queueOnLinkedListPrototype.removeLast();
        queueOnLinkedListPrototype.removeLast();
        assertEquals(2, queueOnLinkedListPrototype.size());
        assertEquals("4", queueOnLinkedListPrototype.tail());
        assertEquals("5", queueOnLinkedListPrototype.head());
        queueOnLinkedListPrototype.addFirst("firstAndLast");
        queueOnLinkedListPrototype.removeLast();
        queueOnLinkedListPrototype.removeLast();
        assertEquals("firstAndLast", queueOnLinkedListPrototype.head());
        assertEquals("firstAndLast", queueOnLinkedListPrototype.tail());
        assertEquals(1, queueOnLinkedListPrototype.size());
    }

}