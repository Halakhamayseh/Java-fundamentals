import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(3);
        clock();

    }

    // function called "pluralize"
    public static String pluralize(String word, int number) {
        if (number == 1) {
            return word;
        } else if (number == 0 || number > 1) {
            return word + "s";
        }
        return word;
    }


    public static void flipNHeads(int n) {
        int counts = 0;
        for (int i = 0; i < n; i++) {
            if ((Math.random()) >= 0.5d) {
                counts++;
                System.out.println("head");
            } else if ((Math.random()) < 0.5d) {
                System.out.println("tails");

            }
        }
        if (n > 1) {
            System.out.println("It took " + n + " flips to flip " + counts + " heads in a row.");
        } else if (n == 1) {
            System.out.println("It took " + n + " flip to flip " + counts + " heads in a row.");
        }
    }

    public static void clock() {
        boolean times = true;
        int mintow = 0;
        while (times) {
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            if (mintow != second) {
                mintow = second;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    }
}