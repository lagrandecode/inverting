
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        System.out.print("Palindrome Game");
        Scanner scan = new Scanner(System.in);
        System.out.print("Plese enter any character to check: ");
        String input = scan.nextLine();
        String reverse = "";
        int lastElement = input.length() - 1;
        while (lastElement >= 0) {
            reverse += input.charAt(lastElement);
            lastElement --; 
        } 
        if(input.equalsIgnoreCase(reverse)){
            System.out.println("This is a Palindrome :\t"+ reverse);
        }else{
            System.out.println("This is not a palindrome :\t"+ reverse);
        }
        scan.close();

    }
    
}
