public class pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--)
                System.out.print(" ");
            for (int k = 1; k < i; k++) {

                System.out.print("A");
            }
            for (int p = 1; p <= i; p++) {
                System.out.println("B    
                ");
 
                 System.out.println();

            }
        }
    }
}