package FawarySystem;

import java.util.ArrayList;
import java.util.Scanner;

import Providers.*;
import Services.*;

public class Display {
	public ILogin log;
	public ISignUp sign;
	public DataBase db = DataBase.Get_Instance();
	Transactions ts = new Transactions();
    public int j;
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
		    	
		    	System.out.println("Enter Email:");
				String email = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();
				boolean tmp = log.login(email, pass);
				for(int i = 0;i<db.users.size();i++){
					if(db.users.get(i).email.equals(email)){
						j = i;
						break;
					}
				}
				if(tmp){
					while(true){
						System.out.println("1-Add Funds to Wallet:");
						System.out.println("2-Search for Service:");
						System.out.println("3-Sign out:");					
						choice = sc.nextInt();
						if(choice == 1){
							db.users.get(j).obj.add_amount();
							System.out.println("____________________");
							System.out.println(db.users.get(j).email);
							System.out.println(db.users.get(j).obj.Balance_amount);
							System.out.println("_____________________");

						}
						else if(choice == 2){
					
					Service service;
					Services ser=new Services();
					service =ser.search();
					service.creatProvider();
					service.provider.creatForm(email);
					String name =  service.provider.getName()+service.getName();
					db.users.get(j).ts.Add_Transaction(email, service.ID, name);
					}
						else if(choice == 4){
							db.users.get(j).ts.search();
//							db.users.get(j).obj.delete_amount(100);
//							System.out.println("____________________");
//							System.out.println(db.users.get(j).email);
//							System.out.println(db.users.get(j).obj.Balance_amount);
//							System.out.println("_____________________");
						}
						else{
							  Click();
								}
							}
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

//package FawarySystem;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import Providers.*;
//import Services.*;
//
//public class Display {
//	public ILogin log;
//	public ISignUp sign;
//	public boolean f = false;
//	public Display(){}
//	public void Click(){
//		if(!f){
//	    	System.out.println("1-Login As Admin!");
//		    System.out.println("2-login AS Users!");
//		    System.out.println("3-Sign Up new users!");
//	    	System.out.println("4-Exit");
//		    Scanner sc = new Scanner(System.in);
//		    int choice = sc.nextInt();
//		    if(choice == 1){
//		    	log = new LoginAdmins();
//		    	System.out.println("Enter Email:");
//				String email = sc.next();
//				System.out.println("Enter Password:");
//				String pass = sc.next();
//				boolean tmp = log.login(email, pass);
//				if(tmp){
//				    System.out.println("1-See Refunds");					
//				}
//				else{
//					Click();
//				}
//			}
//		    else if(choice == 2){
//		    	log = new LoginUsers();
//		    	System.out.println("Enter Email:");
//				String email = sc.next();
//				System.out.println("Enter Password:");
//				String pass = sc.next();
//				boolean tmp = log.login(email, pass);
				
//				if(tmp){
					
//
//                         Services ser=new Services();
//                         service =ser.search();
//                          service.creatProvider();		    					
//				}
				
//				else{
//					Click();
//				}
//			}
//		    else if(choice == 3){
//		    	sign = new SignupUsers();
//		    	sign.Sign_New();
//				Click();
//		    }
//		    else{
//		    	System.out.println("Terminated Program!");
//		    	System.exit(0);
//		    }
//		}
//	}
//
//}
