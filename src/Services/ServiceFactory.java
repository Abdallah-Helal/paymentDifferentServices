package Services;

import java.util.Scanner;

public class ServiceFactory {
    Scanner sc = new Scanner(System.in);

    public Service creatService(){
        System.out.println("1-Mobile Recharge ?");
        System.out.println("2-Internet Payment?");
        System.out.println("3-Landline?");
        System.out.println("3-Donation?");
        int choice = sc.nextInt();
        if(choice==1) {
            return new MobileRechargeService();
        }
        else if(choice==2) {
            return new InternetRechargeService();
        }
        else if(choice==3) {
            return new LandlineRechargeService();
        }
        else{
            return new DonationRechargeService();
        }
    }
}
