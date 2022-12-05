package Services;

import ServiceProviderFactorys.DonationProviderFactory;
import ServiceProviderFactorys.MobileProviderFactory;

public class MobileRechargeService extends Service{
    public MobileRechargeService(){
    	super();
    	this.name="MobileRecharge";
    }

	@Override
	public void creatProvider() {
		this.servicefactory=new MobileProviderFactory();
        this.provider=servicefactory.createServiceProvider();
		
	}
    
}
