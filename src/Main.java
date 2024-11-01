import exceptions.ExceptionDemo;
import generics.GenericList;
import generics.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 var list  =  new GenericList<Integer>();
 list.add(1);
 list.add(2);
  int number =  list.get(2);

    }
}