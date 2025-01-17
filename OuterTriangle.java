
import java.util.Scanner;

public class OuterTriangle {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.print("Please enter the number of rows");
        int rows = scan.nextInt();
        System.out.print("Please enter the number of columns");
        int cols = scan.nextInt();
        if(rows > 5){
            System.out.print("Please enter rows less than 5");
        }
        else{
            for( int i = 1; i <=rows; i++){
                for( int j = 1; j<=cols; j++){
                    if((i==1 || i==5) && (i + j) % 4 == 0){
                        System.out.print("*");
                    }
                    else if((i == 2 || i == 4) && (i + j) % 2 == 0){
                        System.out.print("*");
                    }
                    else if(i == 3 && (i + j) % 4 == 0){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
        }

        scan.close();
    }
}
// 
