import java.util.Scanner;

public class ZigzagPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the zigzag pattern: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns (length of zigzag): ");
        int cols = scanner.nextInt();

        // Print zigzag pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i + j) % rows == 1) { // Formula to print stars diagonally
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
