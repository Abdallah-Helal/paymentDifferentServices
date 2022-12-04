package Services;

import ServiceProviderFactorys.InternetProviderFactory;

public class InternetRechargeService extends Service {
    public InternetRechargeService(){
        this.name="InternetRecharge";
        this.servicefactory=new InternetProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
}
