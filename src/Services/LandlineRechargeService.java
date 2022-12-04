package Services;
import ServiceProviderFactorys.LandlineProviderFactory;

public class LandlineRechargeService extends Service{
    public LandlineRechargeService(){
        this.servicefactory=new LandlineProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
}
