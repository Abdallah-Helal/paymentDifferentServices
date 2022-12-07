package FawarySystem;

import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

import Person.*;
import Providers.*;
import Services.*;
import Sign.*;


public class Display {
	Scanner sc = new Scanner(System.in);
	boolean f = false;

	ILogin log;
	ISignUp sign;
	Admins admin;
	Users user;
	Services services=new Services();
	DataBase db = DataBase.Get_Instance();
	
	public void Click(){
		if(!f){
	    	System.out.println("1-Login As Admin!");
		    System.out.println("2-login AS Users!");
		    System.out.println("3-Sign Up new users!");
	    	System.out.println("4-Exit");
		    int choice = sc.nextInt();
		    if(choice == 1){
				
		    	log = new LoginAdmins();
				admin =(Admins) log.login();
				if(admin !=null){
					while(true){
					  System.out.println("1-add discount");
					  System.out.println("2-see Refunds");
						System.out.println("3-Sign out:");
					  int choice2 = sc.nextInt();
					if(choice2==1)	
						services.setDiscount();
					else if(choice2==2 && user!=null){
						user.refund.printRefunds();
							
					}							
				
				   else{
					   Click();
				}
					}
				}
			}
		    else if(choice == 2){
		    	log = new LoginUsers();
				user = (Users)log.login();
				if(user !=null){
					while(true){
						System.out.println("1-Add Funds to Wallet:");
						System.out.println("2-Search for Service:");
						System.out.println("3-Search for discount");
						System.out.println("4-Ask for Refund:");	
						System.out.println("5-Sign out:");
												
						choice = sc.nextInt();
						if(choice == 1){
							user.wallet.add_amount();
							//display users email and his balance in the wallet aftre adding
							System.out.println("____________________");
							System.out.println(user.email);
							System.out.println(user.wallet.Balance_amount);
							System.out.println("_____________________");

						}
						else if(choice == 2){
					
							Service service;
							service =services.search();
							service.creatProvider();
							service.provider.creatForm(user);
							user.ts.Add_Transaction(user,service);
						}
						else if(choice==3){
							services.searchDiscount();
						}
						else if(choice == 4){
							user.refund.ask_refund(user);
							
						}
						else{
							  Click();
						}
					}
				}
			}
		    
		    else if(choice == 3){
		    	sign = new SignupUsers();
		    	sign.Sign_New();
				Click();
		    }
		    else{
		    	System.out.println("Terminated Program!");
		    	System.exit(0);
		    }
		}
	}

}