package exceptions;

import java.io.IOException;

public class Account {
     private float balance;
     public void deposit( float amount) throws IOException {
         if (amount < 0) {
             throw new IOException();
         }

     }
     public void withdraw(float amount) throws InsufficientFundsException {
         if (amount > balance) {
             throw new InsufficientFundsException();
         }
     }
}
