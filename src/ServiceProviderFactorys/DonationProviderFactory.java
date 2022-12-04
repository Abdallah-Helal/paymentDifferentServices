package ServiceProviderFactorys;

import java.util.*;

import Providers.CancerHospital;
import Providers.IServiceProvider;
import Providers.NGOs;
import Providers.Schools;

public class DonationProviderFactory implements IServiceProviderFactory {
    Scanner sc = new Scanner(System.in);
    public IServiceProvider createServiceProvider() {
        System.out.println("1-schools?");
        System.out.println("2-CancerHospital?");
        System.out.println("3-NGOs?");
        int choice = sc.nextInt();
        if(choice==1) {
            return new Schools();
        }
        else if(choice==2) {
            return new CancerHospital();
        }
        else {
            return new NGOs();
        }
    }
    
}
