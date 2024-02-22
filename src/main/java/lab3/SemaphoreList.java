package lab3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Semaphore;

public class SemaphoreList<E> extends ArrayList<E> {
    private static final Semaphore semaphore = new Semaphore(1);

    @Override
    public int size() {
        try {
            semaphore.acquire();
            int tempSize = super.size();
            semaphore.release();
            return tempSize;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean contains(Object o) {
        try {
            semaphore.acquire();
            boolean cnt = super.contains(o);
            semaphore.release();
            return cnt;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public E get(int index) {
        try {
            semaphore.acquire();
            Objects.checkIndex(index, super.size());
            E obj = super.get(index);
            semaphore.release();
            return obj;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean add(E e) {
        try {
            semaphore.acquire();
            super.add(e);
            semaphore.release();
            return true;
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
