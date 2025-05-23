public class q4 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length);
        } finally {
            System.out.print("finally block executed");

        }
    }

}
