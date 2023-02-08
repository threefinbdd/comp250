/**
 * MyCustomTicTacToe.java
 * 
 * Sample demonstration of utilizing a text file to customize
 * the input symbols for Player 1 and Player 2 for TicTacToe.
 * 
 * Also demonstration of utilizing a text file for the Program 
 * to track each player's placement on the board.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyCustomTicTacToe {
    /**
     * Reads in a text file titled "Symbols.txt" to customize
     * player symbols rather than using 'O' and 'X'
     * @return
     * @throws Exception
     */
    public static char[] readCustomSymbols() throws Exception {
        char[] symbols = new char[3];
        File inputFile = new File("Symbols.txt");
        Scanner readFile = new Scanner(inputFile);
        String line = readFile.nextLine();
        symbols[0] = ' ';
        symbols[1] = line.charAt(0);
        symbols[2] = line.charAt(2);
        readFile.close();
        /* Verify text file is read in */
        // for (char c : symbols) {
        //     System.out.println(c);
        // }
        return symbols;
    }

    /**
     * An alternative approach to reading in the text file titled "Symbols.txt"
     * @return
     * @throws Exception
     */
    public static char[] alternateReader() throws Exception {
        char[] symbols = new char[3];
        File inputFile = new File("Symbols.txt");
        FileReader input = new FileReader(inputFile);
        
        char[] line = new char[3];
        input.read(line);
        System.out.println(line);
        //  can we condense this to one char array with a
        //  swap algorithm:  
        //  line exists as: [0] = *; [1] = ' '; [2] = x; 
        symbols[0] = ' ';
        symbols[1] = line[0];
        symbols[2] = line[2];
        input.close();
        return symbols;
    }
    /**
     * Creates a board for the game of Tic-Tac-Toe
     * @return a 3x3 array of characters
     */
    public static char[][] initBoard(char placement) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = placement;
            }
        }
        return board;
    }
    
    /**
     * Prompts player for the [row][col] input to place
     * a marker on the board.  
     * @param board: a 3x3 board
     * @param currentPlayer: a char representation of the current player's turn
     */
    public static void playerTurn(char[][] board, char currentPlayer, char[] symbols) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        int choiceRow = -1;
        int choiceCol = -1;

        isValid = false; //  Reset valid move from previous iteration
        while (!isValid) {
            System.out.println("Select a point on the board:");
            System.out.println("Row (1, 2, or 3): ");
            choiceRow = input.nextInt();
            System.out.println("Column (1, 2, or 3): ");
            choiceCol = input.nextInt();
            if (board[choiceRow - 1][choiceCol - 1] == symbols[0]) {
                isValid = true; // only able to place on unused slots
            } else {
                System.out.println("Spot has already been used.  Select a new position.");
            }
        }

        board[choiceRow - 1][choiceCol - 1] = currentPlayer;
        input.close();
    }

    /**
     * Output the tic-tac-toe board's current state
     * @param board: a 3x3 array
     */
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    /**
     * Writes the board's current state into a text file
     * @param board: a 3x3 array
     */
    public static void writeBoard(char[][] board) throws Exception{
        File outFile = new File("Board.txt");
        FileWriter output = new FileWriter(outFile);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.print("[" + board[i][j] + "]");
                output.write("[" + board[i][j] + "]");
            }
            // System.out.println();
            output.write("\n");
        }
        output.close();  //  Performs a "Save" and "Close" to file
    }
    /**
     * Validates the board's current state to find 
     * a winner.
     * @param board: 3x3 board
     * @param symbol: current player's placement ('O' or 'X')
     * @return: boolean if current player has a winning combination on the board
     */
    public static boolean checkBoard(char[][] board, char symbol) {
        boolean hasWinner = false;

        return hasWinner;
    }
    
    public static void main(String[] args) throws Exception {
        char[][] board = new char[3][3];
        char[] placement = readCustomSymbols();
        // char[] placement = alternateReader();
        board = initBoard(placement[0]);
        printBoard(board);

        boolean playerOne = false;
        boolean playerTwo = false;
        int turns = 1; // controls who goes next
        
        char currentPlayer = ' ';
        while (!playerOne || !playerTwo) {
            if (turns % 2 == 0) {
                System.out.println("Player Two choice. . .");
                currentPlayer = placement[2];
            } else {
                System.out.println("Player One choice. . .");
                currentPlayer = placement[1];
            }

            playerTurn(board, currentPlayer, placement);
            printBoard(board);
            writeBoard(board);
            //  checkBoard(board, placement);
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
    }  //  End of Main Method    
}
