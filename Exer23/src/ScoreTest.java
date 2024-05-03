import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);

        int maxScore = 0;


        while(true){
            System.out.println("Please input the scores of students: ");
            int intScore = scanner.nextInt();

            if(intScore < 0){
                break;
            }

            v.addElement(intScore);

            if(maxScore < intScore){
                maxScore = intScore;
            }
        }
        System.out.println("The highest grade is " + maxScore + ".");
        for(int i = 0; i < v.size(); i++){
            Object objScore = v.elementAt(i);

            int score = (Integer)objScore;
            char grade;
            if(maxScore - score <= 10){
                grade = 'A';
            } else if (maxScore - score <= 20) {
                grade = 'B';
            }else if (maxScore - score <= 30) {
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("Student" + i + "score is " + score + " and level is " + grade + ".");
        }





        scanner.close();
    }
}
