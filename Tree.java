
import java.util.Scanner;

public class Tree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for( int i = 1; i<=rows; i++){
            for(int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i - 1); j++){
                if(j == 1 || j == (2*i - 1) || i == rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        
        scanner.close();
    }
}