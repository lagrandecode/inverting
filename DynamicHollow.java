
import java.util.Scanner;

public class DynamicHollow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dynamic Hollow Game");
        System.out.print("Please enter any number");
        int rows = scanner.nextInt();
        for (int i = 1; i<= rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i - 1); j++){
                if (j == 1 || j == (2*i - 1) || i == rows) {
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
