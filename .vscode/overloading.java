
class parent {
    void sum(int a) {
        System.out.println("main hoon don");
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        parent obj = new parent();
        obj.sum(47);
        obj.sum(47, 24);
        obj.sum(47, 24, 56);
    }
}