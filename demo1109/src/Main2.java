import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // Sorting the list
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }

        // Integer -> int 的 泛型
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(10);
        // Sorting the list
        Collections.sort(list2);
        // Traversing list through the for-each loop
        for (Integer i : list2) {
            System.out.println(i);
        }
    }
}
