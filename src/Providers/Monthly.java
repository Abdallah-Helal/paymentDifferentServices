package Providers;

public class Monthly implements IReceipt{
    int numofmonthes;
    public Monthly(){
        this.numofmonthes=1;
    }
    public int handler(){
      return numofmonthes;
    }

}
