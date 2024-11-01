package generics;

public class GenericList<T>{
     private T[] elements   = (T[]) new Object[10];;
     private int size;

     public void add(T element) {
         elements[size++] = element;

     }
     public T get(int index) {
         return elements[index];
     }
      // we can add some constraints to our Generics classes


}
