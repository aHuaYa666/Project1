import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("Lily", 1001, new MyDate(1991, 4, 3), 50000);
        emps[1] = new HourlyEmployee("Jack", 1002, new MyDate(2000, 2, 12), 240, 50);

        System.out.println("Please input current month: ");
        int month = scan.nextInt();

        for(int i = 0; i < emps.length; i++){
            System.out.println(emps[i].toString());
            System.out.println("My wage is " + emps[i].earnings());

            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("Happy Birthday!");

            }

        }
        scan.close();
    }

}
