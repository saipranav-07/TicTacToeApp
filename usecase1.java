public class TicTacToe {

    public static void main(String[] args) {

        // Step 1: Create a 3x3 character array
        char[][] board = new char[3][3];

        // Step 2: Initialize all cells with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Step 3: Print the board
        System.out.println("Empty Tic-Tac-Toe Board:");
        printBoard(board);
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
    }
}