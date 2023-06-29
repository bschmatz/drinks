package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation that stores String objects.
 * The elements are stored in a List and have a maximum size defined upon instantiation.
 */
public class StringQueue implements IQueue {
    /**
     * The list of elements in the queue.
     */
    private List<String> elements;
    /**
     * The maximum size of the queue.
     */
    private final int maxSize;

    /**
     * Constructs a StringQueue object with the specified maximum size.
     * Initializes elements property with empty ArrayList.
     *
     * @param maxsize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
        this.elements = new ArrayList<>();
    }

    /**
     * Adds the specified element to the queue.
     *
     * @param obj the String object to be added to the queue
     * @return true if the element was successfully added, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
            return true;
        } else return false;
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else return null;
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty. Can't get element.");
        }
        return element;
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        String element = peek();
        if (elements.size() > 0) {
            elements.remove(element);
        }
        return element;
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty. Can't remove element.");
        }
        return element;
    }

}