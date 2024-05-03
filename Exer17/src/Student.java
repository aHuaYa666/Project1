public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void eat(){

        System.out.println("Students need food.");
    }
    public void sleep(){

        System.out.println("Student need sleeping.");
    }

    @Override
    public void breath() {
        System.out.println("Students need fresh air. ");
    }
}
