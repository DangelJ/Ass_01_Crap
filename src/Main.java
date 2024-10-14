import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int point = 0;
        boolean reRoll = false;
        boolean done = false;

        while (!done) {

            int roll1 = (int) ((Math.random() * 6) + 1);
            int roll2 = (int) ((Math.random() * 6) + 1);
            int rollSum = 0;
            rollSum = roll1 + roll2;

            System.out.println("First roll is " + roll1 + " and Second roll is " + roll2);
            System.out.println("Your sum is " + rollSum);

            if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
                System.out.println("You crapped out");
            } else if (rollSum == 7 || rollSum == 11) {
                System.out.println("You got a natural, you win!");
            } else {
                point = rollSum;
                System.out.println("You need to roll " + point + " to win.");

                while (!reRoll) {
                    roll1 = (int) (Math.random() * 6) + 1;
                    roll2 = (int) (Math.random() * 6) + 1;
                    rollSum = roll1 + roll2;

                    System.out.println("");
                    System.out.println("First roll is " + roll1 + " Second roll is " + roll2);
                    System.out.println("Your sum is " + rollSum);


                    if (rollSum == 7) {
                        System.out.println("You lost bum.");
                        reRoll = true;
                    } else if (rollSum == point) {
                        System.out.println("You won!");
                        reRoll = true;
                    }
                }
            }

            while (true) {
                System.out.println("Would you like to play again? [Y/N]");
                if (console.next().equalsIgnoreCase("N")) {
                    done = true;
                    break;
                } else if (console.next().equalsIgnoreCase("Y")) {
                    System.out.println("Restarting game.");
                    break;
                } else {
                    System.out.println("Please enter the proper format.");
                }
            }
        }
    }
}
