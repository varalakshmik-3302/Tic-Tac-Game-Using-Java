# Tic-Tac-Toe Game in Java

This is a console-based Tic-Tac-Toe game implemented in Java. It supports both Human vs Human and Human vs AI gameplay.

## Features

- Play against another human or an AI opponent
- Turn-based game logic with input validation
- Simple and modular code using object-oriented design

## Files

- `AIPlayer.java` – Defines the behavior of the AI player
- `HumanPlayer.java` – Handles input from the human player
- `Player.java` – Abstract base class for both player types
- `TicTacGame.java` – Contains the game board and core logic
- `LaunchGame.java` – Main class to run the game

## How to Run

### Prerequisites

- Java JDK 8 or higher

### Steps

1. Open terminal in the project folder
2. Compile all `.java` files:
   javac *.java
3.Run the game:
   java LaunchGame
## Future Improvements

- Implement a smarter AI using the Minimax algorithm
- Add a graphical user interface (GUI) using JavaFX or Swing
- Enable multiplayer mode over a network
- Add a scoreboard to track wins and losses
- Include save/load game functionality

## License

This project is open source and available under the [MIT License](LICENSE).
