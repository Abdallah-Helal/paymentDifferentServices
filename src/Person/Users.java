package Person;

import FawarySystem.Refund;
import FawarySystem.Transactions;

public class Users extends Person {
	public Wallet wallet;
	public Refund refund;
	public Transactions ts;
	public Users(){
		super();
	}
	public Users(String name,String pass,String email){
		super(name,pass,email);
		wallet = new Wallet();
		refund = new Refund();
		ts = new Transactions();
	}
}
