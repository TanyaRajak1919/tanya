import java.util.Scanner;

class Arithmatic {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter two Number");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println(" Addition" + (a + b));
        System.out.println("Subtraction" + (a - b));
        System.out.println("Division" + (a / b));
        System.out.println("Remainder" + (a % b));
    }

}
