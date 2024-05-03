public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1122,20000, 0.045, 5000);
        checkingAccount.withdraw(5000);
        System.out.println("Balance is " + checkingAccount.getBalance());
        System.out.println("Overdraft is " + checkingAccount.getOverdraft());

        checkingAccount.withdraw(18000);
        System.out.println("Balance is " + checkingAccount.getBalance());
        System.out.println("Overdraft is " + checkingAccount.getOverdraft());

        checkingAccount.withdraw(3000);
        System.out.println("Balance is " + checkingAccount.getBalance());
        System.out.println("Overdraft is " + checkingAccount.getOverdraft());
    }
}
