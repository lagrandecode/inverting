
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int num = 1;
        while (num<=n) {
            if (num % 2 == 0) {
                System.err.println(num);
               
            }
            num++; 
            
        }
     






        scan.close();
    }
    
}
// num = 1

// while(num <= 100){
//     num++;
//     print(num);
// }