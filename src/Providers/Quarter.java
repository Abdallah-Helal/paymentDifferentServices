package Providers;

public class Quarter implements IReceipt {
    int numofmonthes;
    public Quarter(){
        this.numofmonthes=3;
    }
    public int handler(int amount){
        return amount*this.numofmonthes;
    }

}
