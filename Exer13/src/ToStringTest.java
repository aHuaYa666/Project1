public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12 );
        System.out.println(u1.toString());
        System.out.println(u1);
    }
}
class User{
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
