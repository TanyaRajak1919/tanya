import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        String str = "java is programming and programming is java";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }

}
