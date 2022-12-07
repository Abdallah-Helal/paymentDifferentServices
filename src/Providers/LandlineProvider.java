package Providers;

import java.util.Scanner;

import FawarySystem.*;
import Payment.CreditCardPayment;
import Payment.OnDeleviryPayment;
import Payment.WalletPayment;
import Person.Users;

public class LandlineProvider extends IServiceProvider {
	IReceipt strategy;
	int amount;
	int y ;
	String num;
	Scanner sc = new Scanner(System.in);
    public LandlineProvider(IReceipt strategy){
        this.strategy=strategy;
        this.name="";

    }
    

    public void creatForm(Users user) {
    	System.out.println("Welcome to LandLine Provider ");
        System.out.println("Enter your Number");
        num = sc.next();
        System.out.println("Enter your Amount");
        amount = sc.nextInt();
        handler(user);
        
        
    }
    public void handler(Users user) {
    	boolean x = false;
        System.out.println("1-wallet");
        System.out.println("2-Credit Card");
        System.out.println("3-On Deleviry");
    	System.out.println("Enter way of payment:");
    	 y = sc.nextInt();
        if(y == 1){
         this.payment = new WalletPayment();
         x = this.payment .pay( user,amount);
        }
        else if (y == 2){
        	this.payment  = new CreditCardPayment();
            x = this.payment .pay(user,amount);        	
        }
        else{
        	this.payment  = new OnDeleviryPayment();
            x = this.payment .pay(user,amount);      
        }
        if (x == true ){
        	System.out.println("Service Complete Successfully!");
        }
        else{
        	System.out.println("Wrong In Complete Service!");        	
        }
     
    }
    
}
