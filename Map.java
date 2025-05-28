import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("tanya", 1);
        map.put("mini", 2);
        map.put("ishu", 3);
        map.put("laksh", 4);
        System.out.println(map.getOrDefault("tanya", null));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((key, value) -> {
            System.out.println(key + value);

        });
    }

}

// int arr={3,21,19,88,20,2};
// HashSet<Integer> set=new HashSet();
// Treeset<integer> set=new Treeset();
// for(inti:arr){
// }