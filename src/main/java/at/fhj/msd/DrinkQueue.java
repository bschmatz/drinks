package at.fhj.msd;

import java.util.NoSuchElementException;
/**
 * Represents a queue data structure to organize different drinks into.
 */
public class DrinkQueue implements DrinkQueueInterface{

    /**
     * Creates a queue without any initial drinks in it
     */
    public DrinkQueue(){}

    /**
     * Creates a queue, but with 1 starting drink
     */
    public DrinkQueue(Drink drink){
        queue.add(drink);
    }


    @Override
    public void add(Drink drink) {
        queue.add(drink);
    }

    @Override
    public Drink peek() {
        if (queue.size() > 0) {
            return queue.get(0);
        } else
            return null;
    }

    @Override
    public Drink remove() {

        if (queue.size() == 0) {
            throw new NoSuchElementException("there's no element any more");
        }

        Drink toBeRemoved = queue.get(0);
        queue.remove(0);
        return toBeRemoved;
    }
}
