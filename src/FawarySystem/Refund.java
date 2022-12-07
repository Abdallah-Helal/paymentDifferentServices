package FawarySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import Person.Users;

public class Refund {
	Scanner scan = new Scanner(System.in);
	public int choice;
	public Map<Integer,String> refunds = new HashMap<Integer,String>();
	public Map<Integer,String> refundsState = new HashMap<Integer,String>();
	public void ask_refund(Users user){
		
		user.ts.print();
		System.out.println("Enter Id of Transaction:");					
        choice = scan.nextInt();
        System.out.println(user.ts.trans.get(user.email).get(choice));
		//add ref
        user.refund.refunds.put(choice,user.ts.trans.get(user.email).get(choice) );
		user.refund.refundsState.put(choice,"wait" );
		System.out.println("Refunded Added!:");				
	}
	public void printRefunds(){
		for (Map.Entry<Integer,String> nameEntry : refunds.entrySet()) {
			int id = nameEntry.getKey();
			String service = nameEntry.getValue();
			System.out.println(id+"-"+service);
		}
	}

}
	
