
import java.util.Scanner;

public class MultiShapeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pattern Game");
        System.err.println("Select 1, if you want Triangle");
        System.err.println("Select 2, if you want Solid Pyramid");
        System.err.println("Select 2, if you want Hallow Pyramid");
        int choice = scanner.nextInt();
        int rows = scanner.nextInt();

        switch (choice) {
            case 1:
            for( int i = 1; i<= rows; i++){
                for(int j = 1; j<=rows-i; j++){
                    System.out.print(" ");

                }
                for(int j = 1; j<=i; j ++){
                    System.out.print("*");;
                }
                System.out.println();
            }

                
                break;
            default:
                throw new AssertionError();
        }

 

    }
    
}
