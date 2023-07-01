package at.fhj.msd;

public class DoubleQueue implements DoubleQueueInterface{
    @Override
    public boolean add(Double obj) {
        return false;
    }

    @Override
    public Double peek() {
        if(doubleList.size() > 0) {
            return doubleList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Double remove() {
        Double toRemove = doubleList.get(0);
        doubleList.remove(0);
        return toRemove;
    }
}
