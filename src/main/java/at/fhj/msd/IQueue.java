package at.fhj.msd;

import java.util.NoSuchElementException;

/**
 * Represents a Queue data structure that stores String elements.
 */
public interface IQueue {
    /**
     * Adds the specified element to the queue.
     *
     * @param obj the String object to be added to the queue
     * @return true if the element was successfully added, false if the queue is full
     */
    boolean offer(String obj);

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    String peek();

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    String element();

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    String poll();

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    String remove();
}