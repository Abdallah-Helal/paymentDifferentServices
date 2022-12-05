package Services;
import ServiceProviderFactorys.DonationProviderFactory;
public class DonationRechargeService extends Service{
   
    public DonationRechargeService(){
	super();
	this.name="DonationRecharge";
        
        
    }
	public void creatProvider() {
		this.servicefactory=new DonationProviderFactory();
        this.provider=servicefactory.createServiceProvider();
		
	}
   

}
