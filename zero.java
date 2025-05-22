//Exceptional handling
public class zero {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("we can not divide by zero");

        }
        System.out.println("hello");
        System.out.println("hii");
    }
}
