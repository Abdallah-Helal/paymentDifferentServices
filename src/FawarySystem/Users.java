package FawarySystem;

public class Users extends Person {
	public Wallet obj;
	public Refund refund;
	public Transactions ts;
	public Users(){
		super();
	}
	public Users(String name,String pass,String email){
		super(name,pass,email);
		obj = new Wallet();
		refund = new Refund();
		ts = new Transactions();
	}
}
