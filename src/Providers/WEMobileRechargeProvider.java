package Providers;

public class WEMobileRechargeProvider extends IServiceProvider {

    public WEMobileRechargeProvider(){
        this.name="WE Mobile";
    }
    @Override
    public void handler(int amount) {
               
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to WE Mobile Recharge Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
  

}
