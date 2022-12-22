package Section4;

import java.util.Scanner;

public class Javagram {
    public static void main(String[] args) {
        String firstName, lastName, userName, city, county;
        int age = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        lastName = scanner.nextLine();
        System.out.println("How old are you?");
        age = scanner.nextInt();
        // dummy nextLine
        scanner.nextLine();
        System.out.println("Make a username");
        userName = scanner.nextLine();
        System.out.println("What city do you live in?");
        city = scanner.nextLine();
        System.out.println("What country is that?");
        county = scanner.nextLine();

        System.out.println("Thank you for joining Javagram!");
        System.out.println("\n Here is the information you entered:");
        System.out.println("\t First name: "+ firstName);
        System.out.println("\t Last Name: "+ lastName);
        System.out.println("\t Age: " + age);
        System.out.println("\t Username: "+ userName);
        System.out.println("\t City: " + city);
        System.out.println("\t Country: " + county);



    }
}
