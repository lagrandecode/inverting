import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int itirate = 1;

        while (itirate<=12) { 
            int mult = itirate*num;
            System.out.println(num + "*" + itirate + "=" + mult);
            itirate ++;
            
        }
        scan.close();

    }
    
}
