abstract class Payment {
    abstract void pay(int a);

    void success() {
        System.out.println("Payment done");
    }
}

class Upipayment extends Payment {
    void pay(int a) {
        System.out.println("pay vi Upi" + a);

    }
}

class Netbanking extends Payment {
    void pay(int b) {
        System.out.println("Pay vi Netbanking" + b);
    }
}

public class Accout {

    public static void main(String[] agrs) {
        Payment obj = new Upipayment();
        obj.pay(25000);
        obj.success();
        Payment obj1 = new Netbanking();
        obj1.pay(5000);
        obj1.success();

    }

}
