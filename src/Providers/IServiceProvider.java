package Providers;

public abstract  class IServiceProvider {
    String name;
    public abstract void handler(int amount);
    public abstract void creatForm();
    public String getName() {
        return this.name;
    }
}
