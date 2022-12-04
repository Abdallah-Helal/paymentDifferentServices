package Services;

import ServiceProviderFactorys.MobileProviderFactory;

public class MobileRechargeService extends Service{
    public MobileRechargeService(){
        this.name="MobileRecharge";
        this.servicefactory=new MobileProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
    
}
