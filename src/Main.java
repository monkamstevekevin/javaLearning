import collections.Customer;
import collections.EmailComparator;
import exceptions.ExceptionDemo;
import generics.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      List<Customer> customers = new ArrayList<>();
      customers.add(new Customer("John", "1" + "@gmail.com"));
      customers.add(new Customer("Alice", "2" + "@gmail.com"));
      customers.add(new Customer("ABob", "3" + "@gmail.com"));
      Collections.sort(customers,new EmailComparator());
      System.out.println(customers);

      //

    }

}