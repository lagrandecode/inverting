
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = num;
        int factorial = 1;

        while( counter > 0){
            factorial *= counter;
            counter--;
        }
        System.out.println(" the factorial is: " + factorial);
        scan.close();
    }
}
