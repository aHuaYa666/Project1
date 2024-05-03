import javax.swing.plaf.synth.SynthColorChooserUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * app for ordering dish
 */
public class App {

    static List<Menu> dishList = new ArrayList<>();
    static List<Menu> personDish = new ArrayList<>();

    public static void main(String[] args) {
        initDish();

        Scanner scanner = new Scanner(System.in);
        while(true){
            showMenu();
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    while(true){
                        showDishMenu();
                        int id = scanner.nextInt();
                        if(id == 0){
                            break;
                        }
                        Menu dish = dishList.get(id - 1);
                        System.out.println("You ordered: " + dish.name);
                        personDish.add(dish);
                    }
                    break;
                case 2:
                    showPersonDish();
                    break;
                case 3:
                    checkout();
                    return;
            }
        }

    }
    public static void showDishMenu(){
        System.out.println("----Please select the dish you want----");
        for(int i = 0; i < dishList.size(); i++){
            Menu dish = dishList.get(i);
            System.out.println(dish.id + "\t" + dish.name + "\t" + dish.price);
        }
        System.out.println("----input the dish number, press 0 to back to the Main Menu---");
    }
    public static void showPersonDish(){
        System.out.println("----Dishes in your cart---");
        for (Menu dish : personDish) {
            System.out.println(dish.id + "\t" + dish.name + "\t" + dish.price);
        }

    }
    public static void checkout(){
        System.out.println("----Please wait for a moment, calculating your cost ing---");
        double total = 0;
        for (Menu dish : personDish) {
            total += dish.price;
        }
        System.out.println("You cost " + total + ".");
    }

    public static void showMenu(){
        System.out.println("----Main Menu-----");
        System.out.println("Menu\t\t\t 1");
        System.out.println("Cart\t\t\t 2");
        System.out.println("Checkout\t\t 3");
        System.out.println("----Select the number you want-----");


    }
    /**
     * initiate menu
     */
    public static void initDish(){
        Menu dish1 = new Menu(1, "Hamburger", 10.0 );
        dishList.add(dish1);
        Menu dish2 = new Menu(2, "Sandwich", 8.0 );
        dishList.add(dish2);
        Menu dish3 = new Menu(3, "Fries", 8.0 );
        dishList.add(dish3);

        dishList.add(new Menu(4, "Coleslaw",6.0 ));
        dishList.add(new Menu(5, "Coke",2.0 ));
    }
}
