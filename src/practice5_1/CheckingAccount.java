package practice5_1;

public class CheckingAccount extends Account {
    
    private final double overDraftLimit;

    CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    CheckingAccount(double balance) {
        super(balance);
        this.overDraftLimit = 0.00;
    }

    @Override
    public String getDescription() {
        return ("Checking account");
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= (balance + overDraftLimit)) {
            balance -= amount;
            return true;
        } else return false;
    }
}
