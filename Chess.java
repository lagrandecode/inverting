public class Chess {
    private static final String RESET = "\u001B[0m";
    private static final String WHITE = "\u001B[47m";
    private static final String BLACK = "\u001B[40m";

    public static void main(String[] args) {
        String[][] board = initializeBoard();
        printBoard(board);
    }

    /**
     * Initializes the chessboard with pieces placed at the correct positions.
     * @return 2D array representing the chessboard.
     */
    private static String[][] initializeBoard() {
        String[][] board = new String[8][8];

        // Define pieces
        String[] backRow = {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"};
        String pawn = "♟";

        // Place pieces for both black and white
        for (int j = 0; j < 8; j++) {
            board[0][j] = backRow[j];  // Black pieces
            board[1][j] = pawn;        // Black pawns
            board[6][j] = pawn;        // White pawns
            board[7][j] = backRow[j];  // White pieces
        }
        return board;
    }

    /**
     * Prints the chessboard with alternating colors.
     * @param board 2D array representing the chessboard.
     */
    private static void printBoard(String[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String background = (i + j) % 2 == 0 ? WHITE : BLACK;
                String piece = board[i][j] != null ? board[i][j] : " ";
                System.out.print(background + " " + piece + " " + RESET);
            }
            System.out.println();
        }
    }
}
