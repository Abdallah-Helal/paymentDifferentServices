package Providers;

public class VodafoneInternetRechargeProvider extends IServiceProvider {
    public VodafoneInternetRechargeProvider(){
        this.name="Vodafone Internet";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Vodafone Internet Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
        
    }
    
}
