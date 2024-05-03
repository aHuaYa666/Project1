public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "orderAA");
        Order order2 = new Order(1001, "orderAA");
        System.out.println(order1.equals(order2));//true

        Order order3 = new Order(1002, new String("orderBB"));
        Order order4 = new Order(1002, new String("orderBB"));
        System.out.println(order3.equals(order4));//true

        String str1 = "aa";
        String str2 = "aa";
        System.out.println(str1 == str2);//true

    }
}
