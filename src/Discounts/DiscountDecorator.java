package Discounts;

import Services.*;
public class DiscountDecorator extends Service{
    protected  Service service;
    public DiscountDecorator(Service service){
        this.service=service;
        this.servicefactory=service.servicefactory;
        this.provider=service.provider;
    }
	@Override
	public void creatProvider() {
		// TODO Auto-generated method stub
		
	}
}
