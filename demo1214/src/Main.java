public class Main {
    public static void main(String[] args) {
        int row = 10;
        for (; row > 0; ) {
            int col = row; // 10
            while (col >= 0) {
                System.out.print(col + " "); // 10 8 6 4 2 0
                col -= 2; // 8 6 4 2 0 -2
            }
            row = row / col; // 10/-2 = -5
            System.out.println("row : " + row);
        }
    }
}