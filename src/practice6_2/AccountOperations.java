package practice6_2;

public interface AccountOperations {
  
    public double getBalance();
    
    public void deposit(double amount);

    public abstract boolean withdraw(double amount);
    
    public abstract String getDescription();
}
