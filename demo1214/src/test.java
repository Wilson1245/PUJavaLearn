import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        test t = new test();
        System.out.println(t.givenUsingPlainJava_whenGeneratingRandomLongBounded_thenCorrect());

    }

    public Set<Long> givenUsingPlainJava_whenGeneratingRandomLongBounded_thenCorrect() {
        Set<Long> itemSet =  new HashSet<>();
        long leftLimit = 1L;
        long rightLimit = 10L;
        while (itemSet.size() < 3) {
            long givenUsing = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
            itemSet.add(givenUsing);
        }
        return itemSet;
    }

}
