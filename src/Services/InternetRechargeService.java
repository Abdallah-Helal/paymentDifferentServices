package Services;

import ServiceProviderFactorys.InternetProviderFactory;

public class InternetRechargeService extends Service {
    public InternetRechargeService(){
        this.servicefactory=new InternetProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
}
