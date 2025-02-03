import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0;    

        // x = -b +- b^2 - 4ac/2a
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first digit a: ");
        int a = scan.nextInt();
        System.out.print("Enter the second digit a: ");
        int b = scan.nextInt();
        System.out.print("Enter the third digit c: ");
        int c = scan.nextInt();
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.print("Every Number is a solution:");
                }
            }
        }






        scan.close();
    }
    
}
