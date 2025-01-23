import java.util.Scanner;

public class PalindromeChecker1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter any word to check :\t");
        String input = scan.nextLine();
        String reversed = "";
        int lastIndexElement = input.length() - 1;

        while (lastIndexElement>=0) {
            reversed += input.charAt(lastIndexElement);
            lastIndexElement --;
        }
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("this is a palindrome:\t" + reversed);
            
        } else {
            System.out.println("This is not as palindrome:\t"+ reversed);
        }







        scan.close();
    }
    
}
