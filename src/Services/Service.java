package Services;
import FawarySystem.IPayment;
import Providers.IServiceProvider;
import ServiceProviderFactorys.*;
import Providers.*;
public abstract class Service {
    protected String name;
//    public IPayment payment;
    public static int ID=0 ;
    public  IServiceProvider provider; 
    public  IServiceProviderFactory servicefactory; 
    
    public Service(){
        ID++;
    }

    public abstract void creatProvider();
             
    public String getName(){
        return this.name;
    }
}
