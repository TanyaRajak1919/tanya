//exception handling q2
public class q2 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b;
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println(" cannot divide by zero");

        }

    }

}
