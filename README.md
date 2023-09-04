# OIBSIP

# Number Guessing Game - Task 2
<!-- number.java -->

The "Number Guessing Game" is a simple Java program that challenges players to guess a randomly generated number within a specified number of attempts. The game consists of three rounds, each with a different maximum number of attempts allowed. Players earn scores based on how quickly they guess the correct number, and their total score is calculated at the end of the three rounds.

## How to Play

1. *Welcome Message*: Upon launching the program, players are greeted with a welcome message indicating that they are about to play the Number Guessing Game.

2. *Rounds and Attempts*: The game consists of three rounds. The number of attempts allowed decreases with each subsequent round: 30 attempts in Round 1, 20 attempts in Round 2, and 10 attempts in Round 3.

3. *Guessing the Number*: In each round, a random number between 1 and 100 is generated. Players are prompted to guess the correct number within the allotted attempts.

4. *Guessing Process*: Players enter their guess, and the program provides feedback:
   - If the guess is lower than the target number, the player is prompted to try a higher number.
   - If the guess is higher than the target number, the player is prompted to try a lower number.

5. *Scoring*: Players earn a score for each round based on their performance. The score is calculated by subtracting the number of tries from the maximum attempts allowed in that round.

6. *End of Round*: At the end of each round, players are informed if they guessed the number within the allowed attempts. The round score is displayed, and if the player succeeded, they move on to the next round.

7. *Game Completion*: After completing all three rounds, the player's total score is calculated by summing up the scores earned in each round. The total score is converted to a percentage out of 100.

8. *Exiting the Game*: The game ends after completing all three rounds, and players are provided with their total score.

## Scoring System

The scoring system rewards players for guessing the correct number quickly:
- Each round has a maximum number of attempts, decreasing with each round (30, 20, and 10).
- For each round, the player's score is calculated as the difference between the maximum attempts and the actual number of tries.


## Conclusion

The "Number Guessing Game" is a fun and straightforward program that introduces basic concepts of Java programming, random number generation, user input, conditional statements, and scoring mechanisms. Players can enjoy the challenge of guessing numbers within a limited number of attempts and strive to achieve higher scores as they progress through the rounds.

-----------------------------------------------------------------------------------------------------------------

# ATM Interface  - Task 3
<!-- atm.java -->

This Java program implements a simple ATM (Automated Teller Machine) system that allows users to perform various banking operations, such as checking account balance, making deposits, making withdrawals, viewing transaction history, resetting PIN, logging in, and logging out. The program is text-based and interactively communicates with the user through the console.

## Features

1. _Account Class_: The `Account` class represents a bank account and provides methods to manage the account's attributes and perform banking operations. It includes functionalities such as checking balance, making deposits, making withdrawals, viewing transaction history, and resetting the PIN.

2. _Transaction Class_: The `Transaction` class encapsulates information about a financial transaction, including its type (e.g., deposit, withdrawal) and the transaction amount.

3. **ATM Class (Main)**: The `atm` class serves as the entry point for the program. It manages the user interactions, login/logout, and menu-driven operations.

## Usage

1. _Starting the ATM_: Upon executing the program, it will greet the user and prompt them to set their initial PIN.

2. _Logging In_: Users need to enter their PIN to log in. Incorrect PIN entries will result in unsuccessful login attempts.

3. _Main Menu_: After successfully logging in, users are presented with a menu of options:

   - _Check Balance_: Display the current account balance.
   - _Deposit_: Add funds to the account.
   - _Withdraw_: Withdraw funds from the account (minimum balance of $100 must be maintained).
   - _Transaction History_: Display a list of past transactions.
   - _Reset PIN_: Change the PIN after verifying the current PIN.
   - _Logout_: Log out from the current session.
   - _Exit_: Terminate the ATM program.

4. _Logout and Exit_: Users can log out of their current session, which returns them to the login screen. Choosing the "Exit" option terminates the ATM program.

## Security and Constraints

1. _PIN Security_: The PIN is the primary security mechanism. Users need to enter the correct PIN to access their account and perform transactions.

2. _Minimum Balance_: The system enforces a minimum account balance of $100. Users cannot withdraw funds that would result in a balance below this threshold.

3. _PIN Reset_: Users can reset their PIN by providing the current PIN and then specifying a new PIN. This process ensures security for PIN changes.

## Conclusion

This simple ATM system provides a foundation for understanding basic concepts of object-oriented programming, user input handling, conditional statements, and interactive program design. It can be further expanded and enhanced to simulate a more realistic banking experience with additional features and improved security measures.
