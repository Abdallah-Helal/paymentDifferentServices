package Providers;

public class WEInternetRechargeProvider extends IServiceProvider{
    public WEInternetRechargeProvider(){
        this.name="WE Internet";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to WE  Internet Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
        
    }
    
}
