package Section4;

public class Points {
    public static void main(String[] args) {
        int points = 0;
        points -= 50;
        System.out.println("Gryffindor loses " + points   + " !");
        points -= 3;
        System.out.println("Gryffindor loses " + points + " !");
        points += 30;
        System.out.println("Gryffindor gains " + points + " !");
        points += 100;
        System.out.println("Gryffindor gains " + points + " !");
        points += 60;
        System.out.println("Gryffindor gains " + points + " !");

        System.out.println(points);

    }
}

