package Providers;

public class OrangeMobileRechargeProvider extends IServiceProvider{
    OrangeMobileRechargeProvider(){
        this.name="Orange Mobile";
    }
    public void handler(int amount) {
           
    }

    public void creatForm() {
        System.out.println("Welcome to Orange Mobile Recharge Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
}
