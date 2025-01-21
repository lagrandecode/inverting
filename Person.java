import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person{
    public static void main(String[] args) {
        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        List myList = new ArrayList<>();
        while (num<=n) {
            if(num % 2 == 0){
                myList.add(num);
                 System.out.print(num + " ");
                
            } 
            num++;
            
        }
        System.out.println("List of added values are: " + myList);
        scan.close();
    }
}