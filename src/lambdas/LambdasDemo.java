package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdasDemo {
    public  static  void show(){
List <String> list =  List.of("a","b","c");
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println("Random Number: " + random);


    }
    public static  void  greet( Printer printer){
        printer.print("Hello World!");
    }
}
/*
  Here is a simple Java program demonstrating how to use lambda expressions.

  First, we define a class `Printer` with a method `print`. Then, we create a lambda expression that accepts a String as an argument and prints it.

 Finally, we use the `greet` method and pass a lambda expression as an argument. This lambda expression uses the `print` method of the `Printer` class to print the greeting.
 The `show` method demonstrates how to use a lambda expression with the `forEach` method of the `List` interface. It takes a lambda expression that accepts an Integer as an argument and prints it.
  it's a consumer interface
  Supplier interface is used to get a random number

 */
