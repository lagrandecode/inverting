import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the spiral pattern: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the spiral pattern: ");
        int cols = scanner.nextInt();

        // Initialize a 2D array to store the pattern
        char[][] pattern = new char[rows][cols];

        // Fill the array with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Spiral logic
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            // Print top row
            for (int i = left; i <= right; i++) {
                pattern[top][i] = '*';
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                pattern[i][right] = '*';
            }
            right--;

            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    pattern[bottom][i] = '*';
                }
                bottom--;
            }

            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    pattern[i][left] = '*';
                }
                left++;
            }
        }

        // Print the final spiral pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
