package ServiceProviderFactorys;

import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import Providers.*;

public class MobileProviderFactory implements IServiceProviderFactory {
    Scanner sc = new Scanner(System.in);
    public IServiceProvider createServiceProvider(String choice) {
        choice=choice.toLowerCase();

        if(choice.contains("we")) {
            return new WEProvider();
        }
        else if(choice.contains("etisalat")) {
            return new EtisalatProvider();
        }
        else if(choice.contains("vodafone")) {
            return new VodafoneProvider();
        }
        else if(choice.contains("orange")){
            return new OrangeProvider();
        }
        else return null;
    }
    
}
