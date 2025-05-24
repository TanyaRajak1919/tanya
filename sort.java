import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, -5, 6 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(-3);
        arrayList.add(-5);
        arrayList.add(6);
        Collections.sorto(arr);
        System.out.println(arr);

    }

}
