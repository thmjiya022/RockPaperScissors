import java.util.Scanner;

public class Player{
    private final Scanner scanner;

    public Player(){
        this.scanner = new Scanner(System.in);
    }

    /**
     * Check if the input is a valid choice for a Rock-Paper-Scissors game.
     * 
     * @param input The input string to be validated.
     * @return true if the input is "rock","paper" or "scissors", false otherwise.
    */

    public static boolean isValidInput(String input){

        return (input.toLowerCase().equals("rock") ||
                input.toLowerCase().equals("paper") ||
                input.toLowerCase().equals("scissors")||
                input.toLowerCase().equals("exit") ||
                input.toLowerCase().equals("quit"));
    }

    /**
     * Prompts the user to enter a choice (rock, paper, scissors) and 
     * validates the input.
     * 
     * @return The validated user choice as a string
     */

    public String getUserChoice(){
        String userChoice;
        System.out.print("Enter a choice (rock, paper, scissors): ");

        userChoice = this.scanner.nextLine().toLowerCase();

        while(!isValidInput(userChoice)){
            System.out.println("Enter a valid guess");
            System.out.println("Enter a choice (rock, paper, scissors): ");
            userChoice = this.scanner.nextLine().toLowerCase();
        }
        return userChoice.toLowerCase();
    }
}