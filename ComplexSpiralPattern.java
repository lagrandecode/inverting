import java.util.Scanner;

public class ComplexSpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size (n) for the spiral pattern: ");
        int n = scanner.nextInt();

        // Initialize a 2D array to store the pattern
        char[][] pattern = new char[n][n];

        // Fill the array with spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Spiral logic
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        char fillChar = '*'; // Alternates between '*' and ' ' for layers

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                pattern[top][i] = fillChar;
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                pattern[i][right] = fillChar;
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    pattern[bottom][i] = fillChar;
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    pattern[i][left] = fillChar;
                }
                left++;
            }

            // Alternate the filling character for the next layer
            fillChar = (fillChar == '*') ? ' ' : '*';
        }

        // Print the final spiral pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
