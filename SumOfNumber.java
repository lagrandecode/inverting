import java.util.Scanner;

public class SumOfNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        System.out.println("Enter and Positive Number: ");

        int n = scan.nextInt();
        while (number<=n) {
            sum += number;
            number ++;
            
        }
        System.out.println("the sum of " + n + "is "+ sum);

    }
}