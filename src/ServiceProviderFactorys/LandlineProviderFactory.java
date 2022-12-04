package ServiceProviderFactorys;
import java.util.Scanner;
import Providers.IServiceProvider;
import Providers.LandlineProvider;
import Providers.*;

public class LandlineProviderFactory implements IServiceProviderFactory {
    Scanner sc = new Scanner(System.in);
    public IServiceProvider createServiceProvider() {
        System.out.println("1- Monthly or 2- Quarter");
        int choice = sc.nextInt();
        if(choice==1)
            return new LandlineProvider(new Monthly());
        else
            return new LandlineProvider(new Quarter());
        
    }
    
}
