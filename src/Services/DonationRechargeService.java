package Services;
import ServiceProviderFactorys.DonationProviderFactory;
public class DonationRechargeService extends Service{
   
    public DonationRechargeService(){
        this.name="DonationRecharge";
        this.servicefactory=new DonationProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }

}
