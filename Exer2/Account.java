public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            system.out.println("You deposit " + amt);
        }

    }
    public void withdraw(double amt){
        if(balance >= amt && amt > 0){
            balance -= amt;
            system.out.println("You withdraw " + amt);
        }else{
            System.out.println("You don't have enough balance...");
        }

    }
}
