package lab3;

import java.util.HashSet;

public class SyncSet<E> extends HashSet<E> {
    @Override
    synchronized public int size() {
        return super.size();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    synchronized public boolean add(E e) {
        return super.add(e);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    synchronized public void clear() {
        super.clear();
    }
}
