import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int num = scan.nextInt();
        while (num>=1) {
            System.out.print(num); 
            num --;    
        }
    

        scan.close();
    }
}