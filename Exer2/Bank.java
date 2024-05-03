public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    public Customer getCustomers(int index) {
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }
        retun customers[index];

    }

    public int getNumberOfCustomer() {

    }
    public void addCustomer(String f; String l){
        Customer cust = new Custoemr(f, l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }
}
