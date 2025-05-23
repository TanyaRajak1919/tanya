import java.util.ArrayList;

public class Dynamic {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("tanya");
        arr.add("laksh");
        arr.add("tanu");
        arr.add(0, "ishu");
        arr.set(1, "isha");
        // System.out.println(arr);
        // System.out.println(arr.get(1));
        arr.clear();
        // arr.remove(1);
        System.out.println(arr);
    }

}
