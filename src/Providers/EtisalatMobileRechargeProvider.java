package Providers;

public class EtisalatMobileRechargeProvider extends IServiceProvider {
    public EtisalatMobileRechargeProvider(){
        this.name="Etisalat Mobile";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Etisalat Mobile Recharge Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
    
}
