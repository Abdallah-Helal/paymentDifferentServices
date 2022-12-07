package Services;
import Providers.IServiceProvider;
import ServiceProviderFactorys.*;
import Payment.IPayment;
import Providers.*;
public abstract class Service {
    protected String name;
    public static int ID=0 ;
    public  IServiceProvider provider; 
    public  IServiceProviderFactory servicefactory; 

    public abstract void creatProvider();
             
    public String getName(){
        return this.name;
    }
}
