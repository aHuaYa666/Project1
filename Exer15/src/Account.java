public class Account {
    private int id;
    private int password;
    private double balance;
    private static double rate;
    private static double minbalance = 1.0;
    private static int init = 1001;

    public Account() {
        this.id = init;
        init ++;

    }

    public Account(int id, int password, double balance) {
        this.password = password;
        this.balance = balance;
        this.id = init;
        init ++;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static double getMinbalance() {
        return minbalance;
    }

    public static void setMinbalance(double minbalance) {
        Account.minbalance = minbalance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Account{" +
                "id=" + id +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}