package Providers;

public class Quarter implements IReceipt {
    int numofmonthes;
    public Quarter(){
        this.numofmonthes=3;
    }
    public int handler(){
        return this.numofmonthes;
    }

}
