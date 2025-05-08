class Parent {
    void sum(int a) {
        System.out.println(a);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }
}

public class Millet {
    public static void main(String[] args) {
        Parent obj = new Parent();

        obj.sum(5);
        obj.sum(5, 7);
    }

}
