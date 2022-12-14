public class Main {
    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount(); // count = 5
        check2.changeCount(); // count = 10
        System.out.println(check1.count + ":" + check2.count);
    }
}

class Test {
    static int count = 0; // 5
    int i = 0;
    public void changeCount() {
        while(i < 5) {
            i ++;
            count ++;
        }
    }
}