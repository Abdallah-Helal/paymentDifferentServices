package Providers;

import java.util.Scanner;

import FawarySystem.*;
import Form.Form;
import Payment.CreditCardPayment;
import Payment.OnDeleviryPayment;
import Payment.WalletPayment;
import Person.Users;

public class OrangeProvider extends IServiceProvider{

    public OrangeProvider(){
        this.name="Orange";
    }
    public boolean creatForm(Users user,Form form) {
    	this.form=form;
        return handler(user);
        
        
    }
    public boolean handler(Users user) {
    	boolean x = false;
        if(this.form.Way.contains("wallet")){
         payment = new WalletPayment();
         System.out.print("done");
         x = payment.pay(user,this.form.amount);
        }
        else if(this.form.Way.contains("OnDeleviry") ){
            payment = new OnDeleviryPayment();
            x = payment.pay(user,this.form.amount);      
        }
        else{
            payment = new CreditCardPayment();
            x = payment.pay(user,this.form.amount);        	
        }
        return x;
     
    }
    
}
