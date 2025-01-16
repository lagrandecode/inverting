public class ZigzagPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 13; // Number of columns

        // Loop through rows
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Condition for stars
                if ((i == 1 || i == 5) && (j - 1) % 4 == 0) { // Row 1 and Row 5
                    System.out.print("*");
                } else if ((i == 2 || i == 4) && j % 2 == 0) { // Row 2 and Row 4
                    System.out.print("*");
                } else if (i == 3 && (j - 3) % 4 == 0) { // Row 3
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space otherwise
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
