import exceptions.ExceptionDemo;
import generics.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   var list  = new GenericList<String> ();
   list.add("John");
   list.add("Jane");
   list.add("Jack");
   list.add("Jill");
 for (var item: list){
     System.out.println(item);

}
    }
}