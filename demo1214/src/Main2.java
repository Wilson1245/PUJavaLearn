import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        List ps = new ArrayList<>();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        // insert code here
        int f = ps.indexOf(p2);

//        if (f >= 0) {
//            System.out.println("Mike Found");
//        } else {
//            System.out.println("Not Found Mike");
//        }

        Patient p1 = new Patient("Mike");

        if (p1.equals(p2)) {
            System.out.println("Good");
        }

    }
}

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

}