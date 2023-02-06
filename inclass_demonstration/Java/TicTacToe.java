
/**
 *  TicTacToe.java
 * 
 *  Sample demonstration of implementing 
 *  a game of tic-tac-toe.
 * 
 */
import java.util.Scanner;

class TicTacToe{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        boolean playerOne = false;
        boolean playerTwo = false;
        int turns = 1;
        char placement = ' ';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = placement;
            }
        }

        System.err.println("Initializing Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
        
        int choiceRow;
        int choiceCol;
        while (!playerOne || !playerTwo) {
            if (turns % 2 == 0) {
                System.out.println("Player Two choice. . .");
                placement = 'X';
            } else {
                System.out.println("Player One choice. . .");
                placement = 'O';
            }
            System.out.println("Select a point on the board:");
            System.out.println("Row (1, 2, or 3): ");
            choiceRow = input.nextInt();
            System.out.println("Column (1, 2, or 3): ");
            choiceCol = input.nextInt();

            board[choiceRow-1][choiceCol-1] = placement;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + board[i][j] + "]");
                }
                System.out.println();
            }
            turns++;
        }
        System.out.println("Tic Tac Toe, three in a row!");
        if (playerOne) {
            System.out.println("Player One wins!");
        } else if (playerTwo) {
            System.out.println("Player Two wins!");
        } else {
            System.out.println("Draw!  Cat's Game!");
        }
    }

}