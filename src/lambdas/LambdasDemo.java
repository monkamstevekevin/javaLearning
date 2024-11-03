package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public  static  void show(){
     Function < String , String> replaceColons = (s) -> s.replace(":","=");
     Function <String , String> addBraces = (s) -> "{ " + s + " }";
    var result =  replaceColons.andThen(addBraces).apply("key:value");
        System.out.println(result);



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
  Function interface is used to transform a given input into a desired output
  BiFunction interface is used to transform two inputs into a single output.
  Predicate interface is used to check whether a given input matches a certain condition.

 */
