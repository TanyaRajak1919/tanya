import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {

            System.out.println(arr[j]);
        }

    }
}
