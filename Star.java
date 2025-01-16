public class Star {
    public static void main(String[] args) {
        int rows =5;
        int cols = 5;
        for(int i = 1; i<=rows; i++){
            for (int j = 1; j<=cols; j++){
                if((i==1 || i==5) && (j-1)% 4 == 0){
                    System.out.print("*");
                }
                else if((i==2 || i == 4) && j%2 == 0){
                    System.out.print("*");

                }
                else if((i == 3) && (j - 3) % 4 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
