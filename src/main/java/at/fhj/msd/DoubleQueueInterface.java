package at.fhj.msd;

import java.util.ArrayList;

public interface DoubleQueueInterface {

    ArrayList<Double> doubleList = new ArrayList<Double>();

    /**
     * Adds the specified element to the queue.
     *
     * @param obj the String object to be added to the queue
     * @return true if the element was successfully added, false if the queue is full
     */
    boolean add(Double obj);

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    Double peek();

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    Double remove();
}
