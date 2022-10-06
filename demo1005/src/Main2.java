public class Main2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.shoot();

    }
}

class Test {
    public void shoot() {
        System.out.println("shoot");
        catM();
    }

    private void catM() {
        System.out.println("catM");
    }
}