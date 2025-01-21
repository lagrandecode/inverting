import java.util.Scanner;

public class SumLastSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int digit = 0;
        while (num!=0) {
            digit = num % 10;
            sum += digit;
            num /=10; 
            
        }
        System.out.print(" the total is :\t" + sum);
        scan.close();

    }
    
}
