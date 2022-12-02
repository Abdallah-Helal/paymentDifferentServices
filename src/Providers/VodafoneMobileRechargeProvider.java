package Providers;

public class VodafoneMobileRechargeProvider extends IServiceProvider {
    public VodafoneMobileRechargeProvider(){
        this.name="Vodafone Mobile";
    }
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    public void creatForm() {
        System.out.println("Welcome to Vodafone Mobile Recharge Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }

}
