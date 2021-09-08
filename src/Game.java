import javax.swing.*;


public class Game {


    public static void main(String[] args) {
        /**
         * call the method that runs the game here
         */
        runGame();
        }

    /**
     *Test user guesses here
     * @param userInput
     * @param randomNumber
     * @param tries
     * @return
     */
        public static String determineGuess(int userInput, int randomNumber, int tries){
            if (userInput <=0 || userInput >100) {
                return "Invalid input, please input a number";
            }
            else if (userInput == randomNumber ){
                return "Correct!\nYour total Guesses: " + tries;
            }
            else if (userInput > randomNumber) {
                return "Your guess is too high, try again.\nInput a Number: " + tries;
            }
            else if (userInput < randomNumber) {
                return "Your guess is too low, try again.\nInput a Number: " + tries;
            }
            else {
                return "Your guess is incorrect\n Input a Number: " + tries;
            }
        }

    /**
     * Accept user guesses here
     * User will be prompt for input as long as the inputed value has not matched the random value
     */
    public static void runGame(){
            int randomNumber = (int) (Math.random()*100 + 1);
            int userGuess = 0;
            int  tries = 1;

            while (userGuess != randomNumber)
            {
                String userInput = JOptionPane.showInputDialog(null,
                        "Enter a number between 1 and 100", "Guessing Game", 3);
                userGuess = Integer.parseInt(userInput);
                JOptionPane.showMessageDialog(null, ""+ determineGuess(userGuess, randomNumber, tries));
                tries++;
            }
        }
    }

