public class Main {
//    public static void main(String[] args) {
//        // 例外事件
//        // 讓程式不會因為一些非尋常的情況導致崩潰
//        try{
//            //檢查此區塊裡程式是否有例外產生，若有就丟出例外
//        }catch (例外類型A ex | 例外類型B ex) {
//            //處理不同例外類型，可有多個catch區塊
//            // 1. getMessage() 例外說明
//            // 2. printStackTrace() 顯示程式執行過程
//        }finally {
//            //此區塊可有可無，用來善後工作，無論例外是否產生皆會執行
//        }
//    }

    // Error 類型
    // 其子類別屬於JVM嚴重錯誤，程式會直接終止，沒有辦法使用例外處理。

    // Exception 類型 checkException, unCheckException
    // 其子類別為各種例外物件，即例外處理可以處理的部分。以下為常見的例外
    // NullPointerException 物件值為 Null 產生的例外
    // ArrayIndexOutOfBoundsException 陣列 index 超出陣列邊界或是 index < 0
    // IllegalArgumentException 方法呼叫時參數型態不同

    public static void main(String[] args) {
        try{
            for (int i = 0; i >= 0; i++) {
                System.out.println("6 / " + i + " = " + 6/i);
            }
        }catch (ArithmeticException e) {
            System.out.println("例外說明 : " + e.getMessage());
            System.out.println("例外原因 : ");
            e.printStackTrace();
        }finally {
            System.out.println("錯誤處理結束");
        }
        System.out.println("End");
    }
}