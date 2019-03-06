# madlib


"Pig" is a very simple game. Two players take turns; on each turn, a player rolls a six-sided die ("die" is the singular of "dice") as many times as she wishes, or until she rolls a 6. Each number she rolls, except a 6, is added to her score this turn; but if she rolls a 6, her score for this turn is zero, and her turn ends. At the end of each turn, the score for that turn is added to the player's total score. The first player to reach or exceed 50 wins.
For example: ● Alice rolls 3, 5, 3, 1, and stops. Her score is now 12. ● Bob rolls 5, 4, 1, 1, 2, and stops. His score is now 13. ● Alice rolls 5, 3, 3, 5, 4, and stops. Her score is now 32 (12 + 20). ● Bob rolls 4, 6. He has to stop, and his score is still 13 (13 + 0). ● Etc.

As defined above, the first player has an advantage. To make the game more fair, we will say that if the first player reaches or exceeds 50, the second player gets one additional turn. (If the second player is the first to reach 50, the first player does not get an additional turn.)
