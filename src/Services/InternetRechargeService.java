package Services;

import ServiceProviderFactorys.*;

public class InternetRechargeService extends Service {
    public InternetRechargeService(){
    	super();
    	this.name="InternetRecharge";
    }
	public void creatProvider() {
		this.servicefactory=new InternetProviderFactory();
        this.provider=servicefactory.createServiceProvider();
		
	}
}
