import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p = 1;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
                p++;
            }
            System.out.println("");
        }
        sc.close();
    }

}
