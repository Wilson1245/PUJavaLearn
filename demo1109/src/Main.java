import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // Adding elements in the List
        // index : 0, 1, 2, 3, ....
        list.add("Wilson");
        list.add("John");
        list.add("Banana");
        list.add("Green");
        System.out.println("Returning element: " + list.get(2));

        //changing the element
        list.set(0, "Apple");
        System.out.println("Returning element: " + list.get(0));

        // standard for
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // forEach
        for(String str : list) {
            System.out.println(str);
        }
    }
}