package Services;
import Providers.IServiceProvider;
import ServiceProviderFactorys.*;
import Providers.*;
public abstract class Service {
    public  IServiceProvider provider; 
    public  IServiceProviderFactory servicefactory; 
}
