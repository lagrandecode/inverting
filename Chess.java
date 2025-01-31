public class Chess {
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[47m";
    public static final String BLACK = "\u001B[40m";

    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 && (j == 1 || j == 8)) || (i == 8 && (j == 1 || j == 8))) { 
                    // Print rook inside the board (at corners)
                    System.out.print(" ♜ ");
                } else if ((i + j) % 2 == 0) {
                    System.out.print(WHITE + "   " + RESET);
                } else {
                    System.out.print(BLACK + "   " + RESET);
                }
            }
            System.out.println();
        }
    }
}
