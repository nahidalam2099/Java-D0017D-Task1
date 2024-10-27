//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;

/**
 * The program is a game where the player will roll 3 dice to get a total
 * sum of 12 in order to win.
 *
 * @author
 */
class Main {
    static final String GAME_START =
            "Welcome to dice game 12. You must roll 1-3 dice and try to get the "
                    + "sum of 12...";
    static final String CHOOSE_DICE =
            "Enter which dice you want to roll [1,2,3] (exit with q):";
    static final String ROUND_WON = "You won!!";
    static final String ROUND_LOST = "You lost!!";
    static final String ROUND_TIE =
            "You neither won nor lost the round.";
    static final String NEXT_ROUND = "Next round!";
    static final String GAME_OVER = "Game Over!";
    static final String ALREADY_SELECTED_DICE =
            "Sorry, you have already rolled that dice. Try again.";
    static final String INVALID_ENTRY =
            "Sorry, that is an invalid entry. Try again. Valid entries are 1, "
                    + "2, 3, and q";
    static final String AMOUNT_WIN_STRING = "#win: ";
    static final String AMOUNT_LOST_STRING = " #loss: ";
    static final String SUM_STRING = " sum: ";
    static final int MAX_DICE_VALUE = 6;
    static final int MIN_DICE_VALUE = 1;
    static final int DICE_SUM_TARGET_VALUE = 12;

    public static void main(final String[] args) {
        int diceOneValue = 0; //  first dice
        boolean isDiceOneRolled = false; // Whether the first dice is rolled

        int diceTwoValue = 0; //  second dice
        boolean isDiceTwoRolled = false; // Whether the second dice is rolled

        int diceThreeValue = 0; //  third dice
        boolean isDiceThreeRolled = false; // Whether the third dice is rolled

        int diceSum = 0; // sum of the dice values
        int countOfWins = 0; // The number of wins
        int countOfLosses = 0; // The number of losses

        boolean gameInProgress = true; // Whether the game is being played

        Scanner playerInput = new Scanner(System.in);
        Random rand = new Random();

        System.out.println(GAME_START);

        while (gameInProgress) {
            System.out.println(CHOOSE_DICE);
            String userChoice = playerInput.nextLine();

            switch (userChoice) {
                case "1":
                    if (!isDiceOneRolled) {
                        diceOneValue = rand.nextInt(MAX_DICE_VALUE)
                                + MIN_DICE_VALUE;
                        System.out.printf("You rolled dice 1: %d\n",
                                diceOneValue);
                        isDiceOneRolled = true; // Mark as rolled
                    } else {
                        System.out.println(ALREADY_SELECTED_DICE);
                    }
                    break;
                case "2":
                    if (!isDiceTwoRolled) {
                        diceTwoValue = rand.nextInt(MAX_DICE_VALUE)
                                + MIN_DICE_VALUE;
                        System.out.printf("You rolled dice 2: %d\n",
                                diceTwoValue);
                        isDiceTwoRolled = true; // Mark as rolled
                    } else {
                        System.out.println(ALREADY_SELECTED_DICE);
                    }
                    break;
                case "3":
                    if (!isDiceThreeRolled) {
                        diceThreeValue = rand.nextInt(MAX_DICE_VALUE)
                                + MIN_DICE_VALUE;
                        System.out.printf("You rolled dice 3: %d\n",
                                diceThreeValue);
                        isDiceThreeRolled = true; // Mark as rolled
                    } else {
                        System.out.println(ALREADY_SELECTED_DICE);
                    }
                    break;
                case "q":
                    System.out.printf(AMOUNT_WIN_STRING + "%d"
                                    + AMOUNT_LOST_STRING + "%d\n",
                            countOfWins, countOfLosses);
                    System.out.println(GAME_OVER);
                    gameInProgress = false; // exit the loop
                    break;
                default:
                    System.out.println(INVALID_ENTRY);
                    break;
            }

            // Check  all dice are rolled or not
            if (isDiceOneRolled && isDiceTwoRolled && isDiceThreeRolled) {
                diceSum = diceOneValue + diceTwoValue + diceThreeValue;
                System.out.printf(AMOUNT_WIN_STRING + "%d"
                                + AMOUNT_LOST_STRING + "%d"
                                + SUM_STRING + "%d\n",
                        countOfWins, countOfLosses, diceSum);

                if (diceSum == DICE_SUM_TARGET_VALUE) {
                    System.out.println(ROUND_WON);
                    countOfWins++;
                } else if (diceSum < DICE_SUM_TARGET_VALUE) {
                    System.out.println(ROUND_LOST);
                    countOfLosses++;
                } else {
                    System.out.println(ROUND_TIE);
                }

                // restart for the next round
                isDiceOneRolled = false;
                isDiceTwoRolled = false;
                isDiceThreeRolled = false;
                System.out.println(NEXT_ROUND);
            }
        }
        playerInput.close();
    }
}

