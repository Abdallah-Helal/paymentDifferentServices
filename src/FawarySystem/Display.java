package FawarySystem;

import java.util.ArrayList;
import java.util.Scanner;

import Providers.*;
import Services.*;

public class Display {
	public ILogin log;
	public ISignUp sign;
	public IServiceProvider service;
	public boolean f = false;
	public Display(){}
	public void Click(){
		if(!f){
	    	System.out.println("1-Login As Admin!");
		    System.out.println("2-login AS Users!");
		    System.out.println("3-Sign Up new users!");
	    	System.out.println("4-Exit");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();
		    if(choice == 1){
		    	log = new LoginAdmins();
		    	System.out.println("Enter name:");
				String name = sc.next();
		    	System.out.println("Enter Email:");
				String email = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();
				boolean tmp = log.login(email, pass);
				if(tmp){
				    System.out.println("1-See Refunds");					
				}
				else{
					Click();
				}
			}
		    else if(choice == 2){
		    	log = new LoginUsers();
		    	System.out.println("Enter name:");
				String name = sc.next();
		    	System.out.println("Enter Email:");
				String email = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();
				boolean tmp = log.login(email, pass);
				if(tmp){
					/*Services sf=new Services();
					Service service=sf.creatService();   	
					System.out.println(service);			
					System.out.println(service.ID);

					Service service1=sf.creatService();   	
					System.out.println(service1);			
					System.out.println(service1.ID);*/
				}
				else{
					Click();
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
