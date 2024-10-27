Task

You will create a program that simulates a variation of a popular game called "Shut the box". We will call this game "the dice game 12". Please note, do NOT google "shut the box" game rules and try to implement that, instead follow the rules below. We mentioned "Shut the box" as an inspiration to this assignment."

Begin the task by constructing a flow chart and program logic on paper. Then, describe your structure in text form (pseudocode) in the comment header of the program so that an outsider can understand what the program does and how your logic/algorithm works.

The game consists of three dice rolls and involves getting 12 across three rolls of dice in each round. Each dice can only be rolled once per round. Example: If a player selects to roll dice #2, then the player cannot roll dice #2 again in the current round.

In each round, the player must be able to choose (by pressing on keyboard) between:

    1 to roll the dice 1
    2 to roll the dice 2
    3 to roll the dice 3
    q to exit the game

Note the following:

    The program must randomly find a value on the selected dice and then calculate the score.
    The program should also present the number of wins and the number of rounds lost.
    The program should continue until the user chooses to cancel the game by pressing q on the keyboard.
    The definition of win is when the sum of the dice on all three rolls is 12, and
    The definition of loss is a sum exceeding 12 after all three dice have been rolled.
    If the sum after three rolls is less than 12, there will be no win or loss, but you go straight to the next round.
    Note dice values must be 1, 2, 3, 4, 5, or 6
    All three dices must be rolled before computing a result. In other words, result is checked only after each round and each round is equal to all three dices rolled.
        For example: If first two dice results in 6 and 6 and a sum of 12, then it is should NOT be considered a loss (because any value on third roll is a loss) or it should NOT be considered because sum is already 12. 

Example Scenario / Demo Run / Test Run

Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...

Enter which dice you want to roll [1,2,3] (exit with q): 4
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): -1
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): w
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): string
Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3, and q

Enter which dice you want to roll [1,2,3] (exit with q): 1
6 0 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 2
6 1 0 sum: 7 # win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3 ] (exit with q): 3
6 1 2 sum: 9 #win: 0 #loss: 0 
You neither won nor lost the game.

Next round! 

Enter which dice you want to roll [1,2,3] (exit with q): 1
6 0 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 1
Sorry, you have already rolled that dice. Try again
Enter which dice you want to roll [1,2,3] (exit with q): 2
6 3 0 sum: 9 #win: 0 #loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 3
6 3 3 sum: 12 #win: 1 #loss: 0 
You won!!

Next round! 

Enter which dice you want to roll [1,2,3] (exit with q): 2
0 6 0 sum: 6 #win: 0 # loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 1
3 6 0 sum: 9 #win: 0 #loss: 0 
Enter which dice you want to roll [1,2,3] (exit with q): 3
3 6 5 sum: 14 #win: 1 #loss: 1 
You lost!!

Next round! 

Enter the dice you want to roll [1,2,3] (exit with q): q
#win: 1 #loss: 1 
Game Over!

In this task, you must check/manage the user's entries and provide relevant feedback if an incorrect entry occurs. The program should not crash, no matter what the user enters. In each round, you can only roll each die once. Use constants for values that do not change.
