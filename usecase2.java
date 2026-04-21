import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Game {
    private String player1;
    private String player2;
    private String currentPlayer;
    private Map<String, Character> symbols;

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.symbols = new HashMap<>();
    }

    public void toss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        String firstPlayer;
        String secondPlayer;

        if (tossResult == 0) {
            firstPlayer = player1;
            secondPlayer = player2;
        } else {
            firstPlayer = player2;
            secondPlayer = player1;
        }

        // Assign symbols
        symbols.put(firstPlayer, 'X');
        symbols.put(secondPlayer, 'O');

        // Set current player
        currentPlayer = firstPlayer;

        // Output results
        System.out.println("Toss Result:");
        System.out.println(firstPlayer + " starts first!");
        System.out.println(firstPlayer + " is 'X'");
        System.out.println(secondPlayer + " is 'O'");
    }

    public void displayGameState() {
        System.out.println("\nGame State:");
        System.out.println("Current Player: " + currentPlayer);
        System.out.println("Symbols: " + symbols);
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Player 1", "Player 2");

        game.toss();
        game.displayGameState();
    }
}