package at.fhj.msd;

public class DoubleQueue implements DoubleQueueInterface{

    public DoubleQueue(){}
    public DoubleQueue(Double obj){
        doubleList.add(obj);
    }

    @Override
    public boolean add(Double obj) {
        boolean success = false;
        int size = doubleList.size();
        if (size < 13){
            doubleList.add(obj);
        }
        if (doubleList.size() > size){
            success = true;
        }
        return success;
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

    public void clear() {
        doubleList.clear();
    }
}
