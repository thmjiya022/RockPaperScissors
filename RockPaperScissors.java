
public class RockPaperScissors {
    private final String computerGuess;
    private final Player player;
 
    public RockPaperScissors(ComputerGuessGenerator generator, Player player){
         this.computerGuess = generator.generateGuess();
         this.player = player;
    }
 
    public RockPaperScissors(){
         this(new ComputerGuessGenerator(), new Player());
    }
 
    public static void welcomeMessage(){
         System.out.println("Welcome to Rock Paper Scissors Game!\n");
    }
 
    
    public void runGame(){

        welcomeMessage();
        while(true){
            
            String userGuess = player.getUserChoice();
            
            if(userGuess.equals(computerGuess)){
                System.out.println("Both players selected "+userGuess + " It's s tie!");
            }
            else if(userGuess.equals("rock")){
                if(computerGuess.equals("scissors")){
                    System.out.println("Rock smashes scissors! You win!");  
                }else{
                    System.out.println("Paper covers the rock! You lose.");
                }
            }else if(userGuess.equals("paper")){
                if(computerGuess.equals("rock")){
                    System.out.println("Scissors cut paper! you lose");  
                }else{
                    System.out.println("Paper covers rock! You win");
                }
            }else if(userGuess.equals("scissors")){
                if(computerGuess.equals("paper")){
                    System.out.println("Scissors cuts paper! You win!");  
                }else{
                    System.out.println("Rock smashes scissors! You lose.");
                }
            }

            if(userGuess.equals("quit") || userGuess.equals("exit")){
                System.out.println("Thank for playing Rock Paper Scissors! Come back soon!");
                break;
            }
        }
    }
 
    public static void main(String[] args) {
         RockPaperScissors rockPaperScissors = new RockPaperScissors();
         rockPaperScissors.runGame();
    }
 
 
}
 