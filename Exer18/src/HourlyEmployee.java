public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double wage, int hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public double earnings(){
        return wage * hour;
    }
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}
