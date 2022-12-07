package Services;
import ServiceProviderFactorys.DonationProviderFactory;
public class DonationRechargeService extends Service{
   
    public DonationRechargeService(){
		this.name="DonationRecharge";          
    }
	public void creatProvider() {
		this.ID++;
		this.servicefactory=new DonationProviderFactory();
        this.provider=servicefactory.createServiceProvider();
		
	}
   

}
