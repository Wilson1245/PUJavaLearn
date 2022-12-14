public class Main5 {
    public static void main(String[] args) {
        int iArray[] = {65, 68, 69}; // 65,68,69
        iArray[2] = iArray[0];// 65,68,65
        iArray[0] = iArray[1];// 68,68,65
        iArray[1] = iArray[2];// 68,65,65
        for (int element : iArray) {
            System.out.print(element + " ");
        }
    }
}
