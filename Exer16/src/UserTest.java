public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom", "654321");
        System.out.println(u2.getInfo());

        System.out.println();

        User u3 = new User("......", "889889");
        System.out.println(u3.getInfo());
    }
}
