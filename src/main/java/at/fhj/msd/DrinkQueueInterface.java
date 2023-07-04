package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public interface DrinkQueueInterface {

    ArrayList<Drink> queue = new ArrayList<Drink>();

    /**
     * Adds the specified element to the queue.
     *
     * @param drink the Drink object to be added to the queue
     */
    void add(Drink drink);

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    Drink peek();

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue, or null if the queue is empty
     * @throws NoSuchElementException if the queue is empty
     */
    Drink remove();
}
