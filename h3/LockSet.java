package Asem4.h3;

import com.sun.source.doctree.SeeTree;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSet<E> implements Set<E> {
    private final Set<E> set = new HashSet<>();
    private static final Lock lock = new ReentrantLock();

    @Override
    public int size() {
        int size = 0;
        lock.lock();
        size = set.size();
        lock.unlock(); /* так все методы*/
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        lock.lock();
        isEmpty = set.isEmpty();
        lock.unlock();
        return isEmpty;
    }

    @Override
    public boolean contains(Object o) {
        boolean contains = false;
        lock.lock();
        contains = set.contains(o);
        lock.unlock();
        return contains;
    }

    @Override
    public Iterator iterator() {
        Iterator<E> iterator = null;
        lock.lock();
        iterator = set.iterator();
        lock.unlock();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[0];
        lock.lock();
        array = set.toArray();
        lock.unlock();
        return array;
    }

    @Override
    public boolean add(Object o) {
        boolean add = false;
        lock.lock();
        add = set.add((E) o);
        lock.unlock();
        return add;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove = false;
        lock.lock();
        remove = set.remove(o);
        lock.unlock();
        return remove;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean addAll = false;
        lock.lock();
        addAll = set.addAll(c);
        lock.unlock();
        return addAll;
    }

    @Override
    public void clear() {
        lock.lock();
        set.clear();
        lock.unlock();

    }

    @Override
    public boolean removeAll(Collection c) {
        boolean removeAll = false;
        lock.lock();
        removeAll = set.removeAll(c);
        lock.unlock();
        return removeAll;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean retainAll = false;
        lock.lock();
        retainAll = set.retainAll(c);
        lock.unlock();
        return retainAll;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean containsAll = false;
        lock.lock();
        containsAll = set.containsAll(c);
        lock.unlock();
        return containsAll;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] array = new Object[0];
        lock.lock();
        array = set.toArray((Object[]) a);
        lock.unlock();
        return array;
    }
}
