package de.thws.businesslogic;

public class InvalidAccount extends Exception{
    public InvalidAccount(String message){
        super(message);
    }
}
