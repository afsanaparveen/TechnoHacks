import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.nextLine().toLowerCase();

        int randomIndex = random.nextInt(choices.length);
        String computerChoice = choices[randomIndex];

        System.out.println("Computer chooses: " + computerChoice);

        // Determine the winner
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock")) {
            if (computerChoice.equals("paper")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        } else {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        }

        scanner.close();
    }
}
