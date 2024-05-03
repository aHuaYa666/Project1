public class EmployeeTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee();


        employee1.id = 123;
        employee1.age = 23;
        employee1.name = "Lily";
        employee1.salary = 20000;
        employee1.birthday = new MyDate();
        employee1.birthday.year = 1998;
        employee1.birthday.month = 2;
        employee1.birthday.day = 28;


        employee1.birthday.show();
    }

}