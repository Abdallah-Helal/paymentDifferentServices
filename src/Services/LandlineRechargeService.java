package Services;
import ServiceProviderFactorys.LandlineProviderFactory;

public class LandlineRechargeService extends Service{
    public LandlineRechargeService(){
        this.name="LandlineRecharge";
        this.servicefactory=new LandlineProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
}
