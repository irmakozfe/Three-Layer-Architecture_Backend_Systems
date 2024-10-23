package de.thws.businesslogic;

public class NoSufficientFundsException extends Exception{
   public NoSufficientFundsException(String message){
       super(message);
   }
}
