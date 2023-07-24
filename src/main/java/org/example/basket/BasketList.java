package org.example.basket;

import org.example.basket.exceptions.BasketEmptyException;
import org.example.basket.exceptions.BasketFullException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BasketList<E>  implements Basket<E> {
    private static final int MAX_CAPACITY = 10;
    private ArrayList<E> items = new ArrayList<>();

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return items.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    @Override
    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return items.toArray(a);
    }

    @Override
    public boolean add(E e) {
        if (items.size() >= MAX_CAPACITY) {
            throw new BasketFullException("Basket is full. Cannot add more items.");
        }
        return items.add(e);
    }

    @Override
    public boolean remove(Object o) {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is empty. Cannot remove any items.");
        }
        return items.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return items.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (items.size() + c.size() > MAX_CAPACITY) {
            throw new BasketFullException("Basket is full. Cannot add more items.");
        }
        return items.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is empty. Cannot remove any items.");
        }
        return items.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return items.retainAll(c);
    }

    @Override
    public void clear() {
        items.clear();
    }
}
