package de.thws.databaselayer;

public class Account {
    private String accountNumber;
    private double balance;
    private String accholder;

    public Account(String accountNumber, String accholder){
        this.accountNumber=accountNumber;
        this.accholder=accholder;
        this.balance=0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        if (newbalance >= 0) {
            this.balance = newbalance;
        }else{
            throw new RuntimeException("Balance can not be under zero!");
        }
    }

    public String getAccholder() {
        return accholder;
    }

    public void setAccholder(String accholder) {
        this.accholder = accholder;
    }
}
