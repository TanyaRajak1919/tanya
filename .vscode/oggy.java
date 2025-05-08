class Animal {
    void makesound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
        Super.bark();
    }
}

public class oggy {

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makesound();

    }

}
