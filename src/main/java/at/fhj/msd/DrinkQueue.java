package at.fhj.msd;

public class DrinkQueue implements DrinkQueueInterface{


    @Override
    public void add(Drink drink) {

    }

    @Override
    public Drink peek() {
        return null;
    }

    @Override
    public Drink remove() {
        Drink toBeRemoved = queue.get(0);
        queue.remove(0);
        return toBeRemoved;
    }
}
