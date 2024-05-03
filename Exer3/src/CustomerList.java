public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if(total < customers.length){
            customers[total] = customer;
            total++;
            return true;
        }
            return false;
    }
    public boolean replaceCustomer(int index; Customer cust){
        if(index >= 0 && index < total){
            customers[index] =cust;
            return true;
        }
        return false;
    }
    public boolean deleteCustomer(int index){
        if(index <0 || index >= total){
            return false;
        }
        for(int i = index; i < total -1; i++){
            customers[i] = customers[i+1];
        }
        customers[total - 1] = null;
        total--;
    }

}
