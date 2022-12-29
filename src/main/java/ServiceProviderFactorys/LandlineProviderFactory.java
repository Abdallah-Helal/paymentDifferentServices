package ServiceProviderFactorys;
import java.util.Scanner;
import Providers.IServiceProvider;
import Providers.LandlineProvider;
import Providers.*;

public class LandlineProviderFactory implements IServiceProviderFactory {
    public IServiceProvider createServiceProvider(String choice) {
        choice=choice.toLowerCase();
        if(choice.contains("monthly"))
            return new LandlineProvider(new Monthly());
        else if(choice.contains("quarter"))
            return new LandlineProvider(new Quarter());
        else return null;
        
    }
    
}
