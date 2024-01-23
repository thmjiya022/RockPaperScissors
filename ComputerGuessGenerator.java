import java.util.Random;

public class ComputerGuessGenerator {
    
    private final Random random;

    public ComputerGuessGenerator(){
        this.random = new Random();
    }

    public ComputerGuessGenerator(Random random){
        this.random = random;
    }

    public String generateGuess(){
        String[] guesses = {"rock", "paper", "scissors"};

        int randomNumber = this.random.nextInt(3);

        return guesses[randomNumber];
    }
}
