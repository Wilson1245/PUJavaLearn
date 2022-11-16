public class Main2 {
    static int div(int a , int b) {
        if (b == 0) {
            throw new RuntimeException("b 不得為 0");
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) {
        int a, b;
        try {
            a = 6;
            b = 2;
            System.out.println("a/b = " + div(a, b));
            a = 5;
            b = 0;
            System.out.println("a/b = " + div(a, b));
        }catch (RuntimeException e) {
            System.out.println("例外說明 : " + e.getMessage());
            System.out.println("例外原因 : ");
            e.printStackTrace();
        }
    }
}
