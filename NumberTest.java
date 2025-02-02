public class NumberTest {
    public static void main(String[] args) {
        int n= 5; 
        String count = "12345";
        String reverse = "";
        int lastIndex = count.length() - 1;
        System.out.println(lastIndex); 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i;j++){
               System.out.println(" "); 
            }
            while (lastIndex>=0) {
                reverse += count.charAt(lastIndex);
                lastIndex --;
                
            }
            for(int j = 1; j<=2*(i-1); j++){
                System.out.print(reverse);
            }
            System.out.println();
        }
    }
    
}
