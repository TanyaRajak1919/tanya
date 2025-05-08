public class v {
    static int b = 20;// static variable
    int c = 30;// instance variable

    public static void main(String[] args) {
        {
            int a = 19;// local variable
            v ref = new v();
            System.out.println(a);
            System.out.println(v.b);
            System.out.println(ref.c);
        }
    }

}
