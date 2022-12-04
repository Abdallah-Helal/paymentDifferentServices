package Discounts;

import Services.Service;

public class SpecificDescount extends DiscountDecorator{

    public SpecificDescount(Service service) {
        super(service);
    }
    
}
