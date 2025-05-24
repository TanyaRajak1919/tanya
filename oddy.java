public class oddy {

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toUpperCase());

        } catch (Exception e) {
            System.out.println("Caught a null pointer exception!");
        }

    }
}
