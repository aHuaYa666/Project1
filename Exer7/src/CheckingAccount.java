public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public void withdraw(double amount){
        if(getBalance() >= amount){
            super.withdraw(amount);
        }else if(getBalance() + overdraft >= amount){
            super.withdraw(getBalance());
            overdraft = amount -getBalance();
        }else{
            System.out.println("You are beyond the overdraft amount.");
        }
    }
}
