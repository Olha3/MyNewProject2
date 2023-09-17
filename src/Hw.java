import java.util.*;

public class Hw {
    public static void main(String[] args) {
        int[] array1 = {5, 11, 7, 20};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.stream(array1).min());
        }
        List<String> list = new ArrayList<>();

        list.add("Енеїда");
        list.add("Кобзар");
        list.add("Лісова пісня");
        list.add("Маруся Чурай");
        list.add("Камінний хрест");
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1","Енеїда");
        map.put("2","Кобзар");
        map.put("3","Лісова пісня");
        map.put("4","Маруся Чурай");
        map.put("5","Камінний хрест");
        System.out.println(map);

    }

}


//