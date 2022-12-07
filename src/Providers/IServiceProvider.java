package Providers;

import FawarySystem.*;
import Payment.IPayment;
import Person.Users;

public abstract class IServiceProvider {
	public String name;
	public IPayment payment;
    public  abstract void handler(Users user);
    public  abstract void creatForm(Users user);
    public String getName(){
    	return this.name;
    }
    
}
