package Providers;

public class NGOs extends IServiceProvider{
    public NGOs(){
        this.name="Non profitable organizations Donation";
    }
    @Override
    public void handler(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to Non profitable organizations Donation");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        
    }
    
}
