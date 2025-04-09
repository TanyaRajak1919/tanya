import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.:");
        int a = sc.nextInt();
        System.out.print("Enter second no.:");
        int b = sc.nextInt();
        System.out.print("Enter an operator:");
        String operation = sc.next();
        int c;
        switch (operation) {
            case "+":
                c = a + b;
                System.out.print(c);
                break;
            case "-":
                c = a - b;
                System.out.print(c);
                break;
            case "*":
                c = a * b;
                System.out.print(c);
                break;
            case "/":
                c = a / b;
                System.out.print(c);
                break;
            default:
                System.out.print("Invaild Operator!!!");
        }

    }

}
