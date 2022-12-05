package Providers;

import java.util.Scanner;

import FawarySystem.*;
import Services.Service;
import Services.Services;

public class CancerHospital extends IServiceProvider {
	public CancerHospital(){
		this.name="CancerHospital";
	}
    public void creatForm(String email) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cancer Hospital Donation ");
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
         payment = new WalletPayment();
         x = payment.pay(email,amount);
        }
        else if (y == 2){
        	payment = new CreditCardPayment();
            x = payment.pay(email,amount);        	
        }
        else{
        	payment = new OnDeleviryPayment();
            x = payment.pay(email,amount);      
        }
        if (x == true ){
        	System.out.println("Service Complete Successfully!");
        }
        else{
        	System.out.println("Wrong In Complete Service!");        	
        }
     
    }
    
    
}
