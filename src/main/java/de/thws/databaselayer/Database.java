package de.thws.databaselayer;

import java.util.ArrayList;

public class Database {

    /*
   ──────────────────୨ৎ─────────────────────
     */
    private ArrayList<Account> accounts = new ArrayList<>();

    public Database(){

    }

    public void createAccount(Account account){
        accounts.add(account);
    }

    public Account search(String accNumber) throws AccountNumberNotFound{
        for (Account account : accounts){
            if(account.getAccountNumber().equals(accNumber)) {
                return account;
            }
        }
        throw new AccountNumberNotFound("Account can not be found!");
    }

    public void update(String accNumber, double newbalance){
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNumber)) {
                account.setBalance(newbalance);
            }
        }
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
     /*
      ──────────────────୨ৎ─────────────────────
     */
}
