package Person;

import java.util.Scanner;

public class Wallet {
	public double Balance_amount ;
	public Wallet(){
		Balance_amount = 0;
	}
	public void add_amount(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount To Add TO Your Wallet:");
		double x = sc.nextDouble();
		Balance_amount += x;
		System.out.println("Funds Add Successfully!");
	}
	public void delete_amount(double x){
		Balance_amount -= x;
		System.out.println("Funds Deleted Successfully!");	
	}
}

