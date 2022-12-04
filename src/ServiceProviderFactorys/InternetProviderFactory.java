package ServiceProviderFactorys;

import java.util.*;
import Providers.*;

public class InternetProviderFactory implements IServiceProviderFactory{
    Scanner sc = new Scanner(System.in);

    public IServiceProvider createServiceProvider() {
        System.out.println("1-WE?");
        System.out.println("2-Etisalat?");
        System.out.println("3-Vodafone?");
        System.out.println("3-Orange?");
        int choice = sc.nextInt();
        if(choice==1) {
            return new WEProvider();
        }
        else if(choice==2) {
            return new EtisalatProvider();
        }
        else if(choice==3) {
            return new VodafoneProvider();
        }
        else{
            return new OrangeProvider();
        }
    }
    
}
