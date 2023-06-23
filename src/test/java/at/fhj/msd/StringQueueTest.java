package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringQueueTest {

    StringQueue queue;

    @BeforeEach
    void setup() {
        queue = new StringQueue(3);
    }

    @Test
    public void testOffer() {
        // Check if adding works
        assertTrue(queue.offer("Element 1"));
        assertTrue(queue.offer("Element 2"));
        assertTrue(queue.offer("Element 3"));
        Assertions.assertEquals("Element 1", queue.peek());

        // Check if adding more than queue maxSize returns false
        assertFalse(queue.offer("Element 4"));
    }

    @Test
    @DisplayName("Test peek() method")
    public void testPeek() {
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Check if first element is correct one
        Assertions.assertEquals("Element 1", queue.peek());

        // Make sure the elements are still in the queue after peeking
        Assertions.assertEquals("Element 1", queue.poll());
        Assertions.assertEquals("Element 2", queue.poll());
        Assertions.assertEquals("Element 3", queue.poll());

        // Check if peeking from an empty queue returns null
        Assertions.assertNull(queue.peek());
    }

    @Test
    @DisplayName("Test for element() with empty queue")
    void testElementEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class, queue::element);
    }

    @Test
    @DisplayName("Test poll() method")
    public void testPoll() {
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        Assertions.assertEquals("Element 1", queue.poll());
        Assertions.assertEquals("Element 2", queue.poll());
        Assertions.assertEquals("Element 3", queue.poll());

        // Test case for polling from an empty queue
        Assertions.assertNull(queue.poll());
    }

    @Test
    @DisplayName("Test remove() with an empty queue")
    void testRemoveEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class, queue::remove);
    }

    @Test
    @DisplayName("Test element() method with non-empty queue")
    void testElementNonEmptyQueue() {
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        Assertions.assertEquals("Element 1", queue.element());
        Assertions.assertEquals("Element 1", queue.peek());
    }

    @Test
    @DisplayName("Test remove() method with non-empty queue")
    void testRemoveNonEmptyQueue() {
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        Assertions.assertEquals("Element 1", queue.remove());
        Assertions.assertEquals("Element 2", queue.remove());
        Assertions.assertEquals("Element 3", queue.remove());
    }

}
