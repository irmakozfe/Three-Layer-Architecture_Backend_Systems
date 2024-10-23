package de.thws.presentationlayer;

import de.thws.businesslogic.*;
import de.thws.databaselayer.*;

public class PresentationLayer {
    private Blogic blogic;

    public PresentationLayer(Blogic blogic) {
        this.blogic = blogic;
    }

    public void moneyTransfer(Account sender, Account recipient, double moneyamount) throws NoSufficientFundsException, InvalidAccount{
      if(moneyamount >0)  blogic.moneyTransfer(sender,recipient,moneyamount);
      else throw new RuntimeException("Amount can not be under zero!");
    }

      /*
             ／＞　 フ
            | 　_　_|
          ／` ミ＿xノ
         /　　　　 |
        /　 ヽ　　 ﾉ
        │　　|　|　|
   ／￣|　　  |　|　|
  |   (￣ヽ＿_ヽ_)__) miuv
  ＼二)
         */

}
