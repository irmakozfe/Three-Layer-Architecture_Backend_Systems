package de.thws.businesslogic;
import de.thws.databaselayer.*;

public class Blogic {
    Database database;

    public Blogic(Database database) {
        this.database = database;
    }

    public boolean isBalanceSufficient(Account sender, double amount) {
        return sender.getBalance() >= amount;
    }

    public boolean validateAccount(Account account){
        return database.getAccounts().contains(account);
    }

    public void moneyTransfer(Account sender, Account recipient, double moneyamount) throws NoSufficientFundsException, InvalidAccount {
        if (validateAccount(sender)) {
            if (validateAccount(recipient)) {
            if (isBalanceSufficient(sender, moneyamount)) {
                sender.setBalance(sender.getBalance() - moneyamount);
                recipient.setBalance(recipient.getBalance() + moneyamount);
                System.out.println("Transaction has been successfully completed!");
            } else {
                throw new NoSufficientFundsException("No sufficient funds in the sender account.");
            }

        } else{
                throw new InvalidAccount("Recipient can not be found!");
            }
    }else{
            throw new InvalidAccount("Sender can not be found!");
        }
    }

        /*
              /| _ ╱|、
             ( •̀ㅅ •́  )
            ＿ノ ヽ ノ＼＿
         /　`/ ⌒Ｙ⌒ Ｙ　 \
         ( 　(三ヽ人　 /　 　|
         |　ﾉ⌒＼ ￣￣ヽ　 ノ
          ヽ＿＿＿＞､＿＿／
             ｜( 王 ﾉ〈
             /ﾐ`ー―彡\
           |╰          ╯|
         |       /\       |
         |      /  \      |
         |    /     \     |
         */
}
