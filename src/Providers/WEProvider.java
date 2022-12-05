package Providers;

import java.util.Scanner;

import FawarySystem.*;

public class WEProvider extends IServiceProvider {


    public void creatForm(String email) {
		Scanner scan = new Scanner(System.in);

    	System.out.println("Welcome to WE Mobile Recharge Provider ");
        System.out.println("Enter your Number");
        String num = scan.next();
        System.out.println("Enter your Amount");
        int amount = scan.nextInt();
        handler(email,amount);
        
        
    }
    public void handler(String email,int amount) {
		Scanner scan = new Scanner(System.in);
    	boolean x = false;
        System.out.println("1-wallet");
        System.out.println("2-Credit Card");
        System.out.println("3-On Deleviry");
    	System.out.println("Enter way of payment:");
    	int y = scan.nextInt();
        if(y == 1){
         this.payment = new WalletPayment();
         x = this.payment .pay(email,amount);
        }
        else if (y == 2){
        	this.payment  = new CreditCardPayment();
            x = this.payment .pay(email,amount);        	
        }
        else{
        	this.payment  = new OnDeleviryPayment();
            x = this.payment .pay(email,amount);      
        }
        if (x == true ){
        	System.out.println("Service Complete Successfully!");
        }
        else{
        	System.out.println("Wrong In Complete Service!");        	
        }
     
    }

}
