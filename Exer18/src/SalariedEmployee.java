public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
