package Providers;
import java.util.*;

public class Services {
    public List <IServiceProvider> services=new ArrayList<IServiceProvider>();
    Scanner sc = new Scanner(System.in);
		    
    public Services(){
        services.add(new OrangeMobileRechargeProvider());
        services.add(new WEMobileRechargeProvider());
        services.add(new VodafoneMobileRechargeProvider());
        services.add(new EtisalatMobileRechargeProvider());
        services.add(new OrangeInternetRechargeProvider());
        services.add(new WEInternetRechargeProvider());
        services.add(new VodafoneInternetRechargeProvider());
        services.add(new EtisalatInternetRechargeProvider());
        services.add(new Schools());
        services.add(new NGOs());
        services.add(new CancerHospital());
        services.add(new LandlineProvider());
        
    }
    public IServiceProvider search(){
        List <IServiceProvider> selections=new ArrayList<IServiceProvider>();
        System.out.println("Enter Your choice");
        String query = sc.next();
        char ch =Character.toUpperCase(query.charAt(0));
        query=ch+query.substring(1);

        for(int i=0;i<services.size();i++){
            System.out.println(services.get(i).getName().trim());
            if(services.get(i).getName().trim().contains(query)) 
                selections.add(services.get(i));      
        }
        if(selections.size()>0){
            System.out.println("Enter Your choice");
            for(int i=0;i<selections.size();i++){
                System.out.print(i);
                System.out.println('-'+selections.get(i).getName());
            }
            int choice = sc.nextInt();
            IServiceProvider x=selections.get(choice);
            return x;
        }
        else {
            System.out.println("We can not find the service ");
            return null;
        }

        
    }

}
