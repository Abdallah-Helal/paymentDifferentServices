package Providers;

public class EtisalatInternetRechargeProvider extends IServiceProvider{
    public EtisalatInternetRechargeProvider(){
        this.name="Etisalat Internet";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Etisalat Internet Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
    
        
    }
    
}
