import java.util.Scanner;

public class Diverting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        String reverse = "";
        int lastIndex = words.length()-1;
        while (lastIndex>=0) {
            reverse += words.charAt(lastIndex);
            lastIndex --;    
        }
        System.out.print(reverse);





        scan.close();
        

    }    
}
