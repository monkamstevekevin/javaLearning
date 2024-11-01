package generics;

public class Utils {
     public static <T extends Comparable<T>> T max(T a, T b) {
         return  (a.compareTo(b) <0) ? a : b;
     }
     public  static  <K, V> void  print( K key, V value ) {
         System.out.println("Key: " + key + ", Value: " + value);
     }
   public  static  void printUser(User user) {
       System.out.println(user);
   }
    public  static  void printUsers(GenericList<? extends User > users) {
        System.out.println("users");
    }


}
