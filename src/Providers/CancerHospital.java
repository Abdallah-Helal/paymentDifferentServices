package Providers;

public class CancerHospital extends IServiceProvider {

    public CancerHospital(){
        this.name="Cancer Hospital Donation";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Cancer Hospital Donation ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
    
    
}
