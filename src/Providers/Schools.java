package Providers;

public class Schools extends IServiceProvider {

    public Schools(){
        this.name="Schools Donation";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Schools Donation");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
    
}
