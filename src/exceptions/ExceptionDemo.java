package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void showException() {
        var account =  new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println( e.getMessage());

        }


    }

}
