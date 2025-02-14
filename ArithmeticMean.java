
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: \t");
        double number1  = scan.nextInt();
        System.out.print("Enter the second number: \t");
        double number2  = scan.nextInt();
        System.out.print("Enter the third number: \t");
        double number3  = scan.nextInt();

        double arithmeticMean = (number1+number2+number3)/3;
        System.out.print(arithmeticMean);

    }   
}
