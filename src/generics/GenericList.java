package generics;

import java.util.Iterator;
import java.util.ListIterator;

public class GenericList<T> implements Iterable<T> {
     private T[] elements   = (T[]) new Object[10];;
     private int size;

     public void add(T element) {
         elements[size++] = element;

     }
     public T get(int index) {
         return elements[index];
     }

    @Override
    public Iterator<T> iterator() {
        return  new ListIterator(this);
    }
     private class ListIterator implements Iterator<T> {
          private GenericList<T> list;
          private  int index;
         public ListIterator(GenericList<T> list) {
             this.list = list;
         }

         @Override
         public boolean hasNext() {
             return (index < list.size);
         }

         @Override
         public T next() {
             return list.elements[index++];
         }
     }
    // we can add some constraints to our Generics classes
    // we made a generic class  with no constraints.
    /*
     we wanted to make this class iterable so that we can iterate
     over it.
     To make this class iterable, we need to implement the Iterable interface.
     The Iterable interface has a single method, iterator(),
     which returns an Iterator.
     We have already implemented the iterator() method in our ListIterator class.
     So, we need to implement the iterator() method in our GenericList class.
     The iterator() method in our GenericList class returns an instance of
     our ListIterator class.
     So, we need to implement the ListIterator class.
     The ListIterator class has two methods, hasNext() and next(),
     which are required by the Iterator interface.

     *
    * */


}
