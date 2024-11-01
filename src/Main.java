import exceptions.ExceptionDemo;
import generics.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      User user  =  new Instructor(17);
       Utils.printUser(user);
        // understanding of wildcard
        // we use it to build generic classes inheritance to cast


}
}