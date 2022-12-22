package Section4;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        String name, city, language;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name?");
        name = scanner.nextLine();
        System.out.println("Hi "+ name+ "! I'm Javabot. Where are you from?");
        city = scanner.nextLine();
        System.out.println("I hear it is beautiful at " + city + "! I'm from a place called Oracle");
        System.out.println("How old are you?");
        age = scanner.nextInt();
        System.out.println("So you're " + age + ",cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age)+ " times older than you.");
        System.out.println("Enough about me. What's your favorite language? (Dont just say Python)");
        scanner.nextLine();
        language = scanner.nextLine();
        System.out.println(language + ", that's great! Nice chatting with you " + name+ ". I have to log off now. See ya!");

    }
}
