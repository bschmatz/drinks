package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleQueueTest {
    private DoubleQueue queue;

    @BeforeEach
    void setup() {
        queue = new DoubleQueue();
    }

    @Test
    void testAdd() {
        // Add an element to the queue
        assertTrue(queue.add(13.0));
    }

    @Test
    void testAddFull() {
        // Fill the queue
        for (int i = 0; i < 13; i++) {
            queue.add((double) i);
        }
        // Verify that the queue is full
        assertFalse(queue.add(14.0));
    }

    @Test
    void testPeek() {
        queue.add(0.0);

        // Verify that the first element is 0.0
        assertEquals(0.0, queue.peek());
    }

    @Test
    void testPeekEmpty() {
        // Verify that the queue is empty
        assertNull(queue.peek());
    }

    @Test
    void testRemove() {
        queue.add(0.0);

        // Remove the first element from the queue
        assertEquals(0.0, queue.remove());
    }

    @Test
    void testRemoveEmpty() {
        // Verify that the queue is empty
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }


}
