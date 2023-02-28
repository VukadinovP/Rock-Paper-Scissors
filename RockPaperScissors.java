import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
        Scanner scanner = new Scanner(System.in);

        String[] computerChoice = {
                PAPER,      ROCK,  SCISSORS
        };
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
//        String input = scanner.nextLine();
//        System.out.println(input);
        String playerMove = scanner.nextLine();
        String computerMove = "";

        while (true) {
            switch (playerMove) {
                case "r", "rock" -> playerMove = ROCK;
                case "p", "paper" -> playerMove = PAPER;
                case "s", "scissors" -> playerMove = SCISSORS;
                default -> {
                    System.out.println("Invalid Input. Try Again...");
                    return;
                }
            }
            Random rnd = new Random();
            int pc = rnd.nextInt(4);
            computerMove = computerChoice[pc];
            System.out.println("Computer choose: " + computerMove);

            if ((playerMove.equals(ROCK) && computerMove.equals(ROCK)) || (playerMove.equals(SCISSORS) && computerMove.equals(SCISSORS))
                    || (playerMove.equals(PAPER) && computerMove.equals(PAPER))) {
                System.out.println("The game was a draw");
                return;
            } else if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))
                    || (playerMove.equals(PAPER) && computerMove.equals(ROCK))) {
                System.out.println("You win");
            } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) || (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))
                    || (playerMove.equals(PAPER) && computerMove.equals(SCISSORS))) {
                System.out.println("You lose");
                return;
            }


        }
    }
}
