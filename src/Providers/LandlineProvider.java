package Providers;

import java.util.Scanner;

public class LandlineProvider extends IServiceProvider {
    Scanner sc = new Scanner(System.in);
    IReceipt strategy=new Monthly();
    public LandlineProvider(){
        this.name="landline";
    }
    @Override
    public void handler(int amount) {
        strategy.handler(amount);
        
    }

    @Override
    public void creatForm() {
        System.out.println("Welcome to LandLine Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
        System.out.println("1- Monthly or 2- Quarter");
        int choice = sc.nextInt();
        if(choice==2) strategy=new Quarter();

        
    }
    
}
