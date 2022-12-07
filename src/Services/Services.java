package Services;

import java.time.Instant;
import java.util.*;

import Discounts.*;

public class Services {
    Scanner sc = new Scanner(System.in);
    private List <Service>services=new ArrayList<Service>();

    public Services(){
        services.add(new MobileRechargeService());
        services.add(new InternetRechargeService());
        services.add(new LandlineRechargeService());
        services.add(new DonationRechargeService());

    }
    
    public Service search(){
        Service selections=null;
        System.out.println("Enter Service You Search For: ");
        String query = sc.next();
        char ch =Character.toUpperCase(query.charAt(0));
        query=ch+query.substring(1);

        for(int i=0;i<services.size();i++){
            if(services.get(i).getName().trim().contains(query)) 
                selections=services.get(i);      
        }
        if(selections!=null){
            return selections;
            
        }
        else {
            System.out.println("We can not find the service ");
            return null;
        }
    }

    public void setDiscount(){
        System.out.println("1-OverallDiscount..?  ");
        System.out.println("2-SpecificDiscount...?  ");
        Integer choice = sc.nextInt();
        if(choice==1){
            // OverAll Discount
            for(int i=0;i<services.size();i++){
                services.set(i,new OverallDiscount(services.get(i)));
            }
        }
        else{
            // Specific Discount

        }

    }
    public void searchDiscount(){

    }
}
