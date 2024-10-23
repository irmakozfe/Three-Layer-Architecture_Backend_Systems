package de.thws.databaselayer;

public class AccountNumberNotFound extends Exception{
    public AccountNumberNotFound(String message){
        super(message);
    }
}
