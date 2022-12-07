package Discounts;

import Services.*;
public  class  DiscountDecorator extends Service{
    protected  Service service;
    public DiscountDecorator(Service service){
        this.service=service;
    }
	public  void creatProvider() {
        this.service.creatProvider();
        this.servicefactory=service.servicefactory;
        this.provider=service.provider;
    }
		
	
}
