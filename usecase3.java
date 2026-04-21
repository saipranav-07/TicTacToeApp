class Board {
    private char[][] board = new char[3][3];

    // Constructor
    public Board() {
        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to display board
    public void displayBoard() {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next line
        }
    }

    // Getter for board
    public char[][] getBoard() {
        return board;
    }
}
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.displayBoard();
    }
}