package Services;
import Providers.IServiceProvider;
import ServiceProviderFactorys.*;
import Providers.*;
public abstract class Service {
    protected String name;
    public static int ID = 0;
    public  IServiceProvider provider; 
    public  IServiceProviderFactory servicefactory; 
    
    public Service(){
        ID++;
    }

    public void creatProvider(){
        this.servicefactory=new DonationProviderFactory();
        this.provider=servicefactory.createServiceProvider();
    }
    public String getName(){
        return this.name;
    }
}
