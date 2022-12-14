import jdk.jshell.spi.SPIResolutionException;

public class Main2 {
    public static void main(String[] args) {
        String product = "Pen";
        product.toLowerCase();
        product.concat("abc");
        System.out.println(product.substring(4, 6));
    }
}
