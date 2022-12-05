package Providers;

import FawarySystem.*;

public abstract class IServiceProvider {
	public String name;
	public IPayment payment;
    public  abstract void handler(String email,int amount);
    public  abstract void creatForm(String email);
    public String getName(){
    	return this.name;
    }
    
}
