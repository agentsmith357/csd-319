/**
 *
 * Author: Jelani Jenkins
 * Date: 06/08/2025
 * Class Name: Java for Programmers
 * Teacher: Elijah Finch
 */
import java.util.Scanner;
import java.util.Random;

public class mini_game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        int computerChoice = rand.nextInt(3); // This is where someone types 1, 2, or 3

        System.out.println("Choose one:");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        int userInput = input.nextInt() - 1;

        if (userInput < 0 || userInput > 2) {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
            return;
        }

        System.out.println("You chose: " + options[userInput]);
        System.out.println("Computer chose: " + options[computerChoice]);

        if (userInput == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userInput == 0 && computerChoice == 2) ||
                   (userInput == 1 && computerChoice == 0) ||
                   (userInput == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

