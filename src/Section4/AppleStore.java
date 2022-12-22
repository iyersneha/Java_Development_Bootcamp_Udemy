package Section4;

public class AppleStore {
    public static void main(String[] args) {
        double profit = 0;
        int numOfCustomers = 0;
        int numOfApples = 0;

        //int applesPurchased = 0;
        System.out.println("You picked 500 apples from the orchard.");
        numOfApples += 500;
        System.out.println("You're selling an apple for 40 cents.");
        double price = 0.40;
        System.out.println("One customer bought 4 apples");
        numOfApples -= 4;
        numOfCustomers++;
        profit += 4 * price;
        System.out.println("Another customer bought 20 apples");
        numOfApples -= 20;
        numOfCustomers++;
        profit += 20 * price;
        System.out.println("Another customer bought 200 apples");
        numOfApples -= 200;
        numOfCustomers++;
        profit += 200 * price;

        System.out.println("So far you made "+ profit + " $");
        System.out.println(numOfCustomers + " customers loved your apples.");
        System.out.println("You have "+ numOfApples + " left");
    }
}
