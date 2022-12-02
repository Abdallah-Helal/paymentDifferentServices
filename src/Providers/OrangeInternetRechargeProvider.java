package Providers;

public class OrangeInternetRechargeProvider extends IServiceProvider {

    public OrangeInternetRechargeProvider(){
        this.name="Orange Internet";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Orange Internet Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
    
}
