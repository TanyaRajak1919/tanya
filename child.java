
public class child {
    String firstname = "seema";
    int age = 30;

    child() {
        System.out.println("hello");

    }

    child(String firstname) {

        this();
        System.out.println(firstname);
    }

    child(String firstname, int age) {
        this(firstname);
        firstname = firstname;
        age = age;
        System.out.println(firstname + " " + age);

    }
}

class main {
    public static void main(String[] args) {
        child obj = new child("harsh", 19);
    }
}