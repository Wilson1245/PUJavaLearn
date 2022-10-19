public class Main {
    public static void main(String[] args) {
//        int[] array = new int[6]; // index : 0,1,2,3,4,5
//        array[0] = 1;
//        array[1] = 10;
//        array[2] = 23;
//
//
//        int[] array2 = {1,2,3,4,5};

        // for, forEach

        // for
        // 1. 可以按照順序
        // 2. 可以顛倒
        // 3. 可以跳順序
//        for (int i = array.length - 1; i >= 0; i = i - 2) {
//            System.out.println(array[i]);
//        }

        // forEach
        // 按照順序
//        for (int element : array) {
//            System.out.println(element);
//        }

        int[][] x = new int[3][2];
        x[0][0] = 32;x[0][1] = 84;
        x[1][0] = 57;x[1][1] = 62;
        x[2][0] = 43;x[2][1] = 18;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

    }
}