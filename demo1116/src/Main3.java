public class Main3 {
    public static void main(String[] args) {
        try {
            for (int i = 1; i< 5; i++) {
                if (i == 3)
                    throw new CustomException(i);
                System.out.println("數字為 : " + i);
            }
        }catch (CustomException e) {
            System.out.println("例外說明 : " + e.getMessage());
            System.out.println("例外原因 : ");
            e.printStackTrace();
        }finally {
            System.out.println("例外處理結束");
        }
        System.out.println("End");
    }
}

class CustomException extends Exception {
    int number;
    public CustomException(int number) {
        this.number = number;
    }

    @Override
    public String getMessage(){
        return ("錯誤 , 數字" + number + "大於 2");
    }
}