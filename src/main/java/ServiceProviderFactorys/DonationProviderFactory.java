package ServiceProviderFactorys;

import java.util.*;

import Providers.CancerHospital;
import Providers.IServiceProvider;
import Providers.NGOs;
import Providers.Schools;

public class DonationProviderFactory implements IServiceProviderFactory {
    public IServiceProvider createServiceProvider(String choice ) {
        choice=choice.toLowerCase();

        if(choice.contains("schools")) {
            return new Schools();
        }
        else if(choice.contains("cancerHospital")) {
            return new CancerHospital();
        }
        else if(choice.contains("ngos")) {
            return new NGOs();
        }
        return null;
    }
    
}
