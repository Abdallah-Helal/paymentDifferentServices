package Services;
import ServiceProviderFactorys.LandlineProviderFactory;
import ServiceProviderFactorys.MobileProviderFactory;

public class LandlineRechargeService extends Service{
    public LandlineRechargeService(){
           super();
          this.name="LandlineRecharge";
    }
	public void creatProvider() {
		this.servicefactory=new LandlineProviderFactory();
        this.provider=servicefactory.createServiceProvider();
		
	}
}
