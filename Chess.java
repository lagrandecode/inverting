public class Chess {
    public static void main(String[] args) {
        int size = 8;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("█ "); // Black square
                } else {
                    System.out.print("  "); // White square
                }
            }
            System.out.println();
        }
    }
}
