package Providers;

import java.util.Scanner;

public class LandlineProvider implements IServiceProvider {
    IReceipt strategy;
    Scanner sc = new Scanner(System.in);
    public LandlineProvider(IReceipt strategy){
        this.strategy=strategy;

    }
    
    public void handler() {
        strategy.handler();
        
    }
    public void creatForm() {
        System.out.println("Welcome to LandLine Provider ");
        System.out.println("Enter your Number");
        System.out.println("Enter your Amount");
      
    }
    
}
