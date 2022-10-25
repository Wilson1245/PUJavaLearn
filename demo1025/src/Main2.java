import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入 最大值: ");

        int max = scanner.nextInt();
        int min = 0;
        int random = (int)(Math.random() * max + 1); // 0 ~ N+1
        System.out.println("請輸入 " + min + " ~ " + max + " 的整數 : ");
        while(true) {
            int number = scanner.nextInt();
            if (number < 0 || number > max ) {
                System.out.println("請輸入正確的數字");
                continue;
            }
            if (number > max) {
                System.out.println("目前 max 為 " + max);
                continue;
            } else if (number < min) {
                System.out.println("目前 min 為 " + min);
                continue;
            }

            if (number > random) {
                max = number;
                System.out.println("要在小一點");
            }else if (number < random){
                min = number;
                System.out.println("要在大一點");
            }

            if (number == random) {
                break;
            }
            System.out.println("答錯 請重新輸入");
        }
        System.out.println("恭喜答對");
    }
}
