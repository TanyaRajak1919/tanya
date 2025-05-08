class Vehical {
    void run() {
        System.out.println("ye run karta hai");

    }
}

class Bike extends Vehical {
    void run() {
        System.out.println("ye bhi chalti hai");
        super.run();
    }
}

public class tan {

    public static void main(String[] args) {

        Vehical obj = new Bike();
        obj.run();

    }
}
