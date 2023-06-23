package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class StringQueue implements IQueue {

    private List<String> elements;
    private int maxSize;

    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
        this.elements = new ArrayList<>();
    }

    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
            return true;
        } else
            return false;
    }

    @Override
    public String peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else
            return null;
    }

    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty. Can't get element.");
        }
        return element;
    }

    @Override
    public String poll() {
        String element = peek();
        if (elements.size() > 0) {
            elements.remove(element);
        }
        return element;
    }

    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty. Can't remove element.");
        }
        return element;
    }

}