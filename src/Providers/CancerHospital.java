package Providers;

import java.util.Scanner;

import FawarySystem.*;
import Payment.CreditCardPayment;
import Payment.OnDeleviryPayment;
import Payment.WalletPayment;
import Person.Users;

public class CancerHospital extends IServiceProvider {
	int amount; int y ;
	String num;
	Scanner scan = new Scanner(System.in);
	public CancerHospital(){
		this.name="CancerHospital";
	}
    public void creatForm(Users user) {
        System.out.println("Welcome to Cancer Hospital Donation ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        num = scan.next();
        amount = scan.nextInt();
        handler(user);
    }
    public void handler(Users user) {
    	boolean x = false;
        System.out.println("1-wallet");
        System.out.println("2-Credit Card");
        System.out.println("3-On Deleviry");
    	System.out.println("Enter way of payment:");
    	y = scan.nextInt();
        if(y == 1){
         payment = new WalletPayment();
         x = payment.pay(user,amount);
        }
        else if (y == 2){
        	payment = new CreditCardPayment();
            x = payment.pay(user,amount);        	
        }
        else{
        	payment = new OnDeleviryPayment();
            x = payment.pay(user,amount);      
        }
        if (x == true ){
        	System.out.println("Service Complete Successfully!");
        }
        else{
        	System.out.println("Wrong In Complete Service!");        	
        }
     
    }
    
    
}
