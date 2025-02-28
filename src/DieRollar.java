import java.util.*;

public class DieRollar {
    public static void main(String[] args) throws InterruptedException{
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        String userInput;
        String gameStart;
        int rollCounter = 0;

        boolean done;


        System.out.println("Would you like to see how many times it take to roll three of a kind? [y/n] ");
        gameStart = in.next().toUpperCase();

        if (gameStart.equals("Y")) {
            do {
                System.out.printf("\n%-6s %-6s %-6s %-6s %-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
                System.out.println("-------------------------------------");

                do {
                    rollCounter++;
                    int die1 = generator.nextInt(6) + 1;
                    int die2 = generator.nextInt(6) + 1;
                    int die3 = generator.nextInt(6) + 1;
                    int sum = die1 + die2 + die3;

                    System.out.printf("%-6d %-6d %-6d %-6d %-6d%n", rollCounter, die1, die2, die3, sum);

                    if (die1 == die2 && die2 == die3) {
                        break;
                    }
                } while (true);

                System.out.println("\nDo you want to continue? [y/n]");
                userInput = in.next().toUpperCase();
                if (userInput.equals("Y")) {
                    rollCounter = 0;
                    done = false;
                }
                else if (userInput.equals("N")) {
                    done = true;
                }
                else{
                    System.out.println("\nInvalid input: " + userInput + "\nrestarting game...");
                    Thread.sleep(2500);
                    rollCounter = 0;
                    done = false;
                }

            } while (!done);
        }
    }
}
