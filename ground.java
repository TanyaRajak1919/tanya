interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

class Human implements Walkable, Runnable {
    public void walk() {
        System.out.println("I am walking");

    }

    public void run() {
        System.out.println("I am running");
    }
}

public class ground {
    public static void main(String[] agrs) {
        Human obj = new Human();
        obj.walk();
        obj.run();

    }

}
