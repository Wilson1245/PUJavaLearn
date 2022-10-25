import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(14);
        list.add(11);
        list.add(5);
        System.out.println(list);
        // index: 0,1,2,3,4,.....
        list.remove(3);
        System.out.println(list);

        boolean ans = list.contains(5);
        System.out.println(ans);

        boolean ansB = list.isEmpty();
        System.out.println(ansB);

        int ansC = list.get(1);
        System.out.println(ansC);

        int ansD = list.size();
        System.out.println(ansD);
    }
}