package org.example;

public class Main {
    public static void main(String[] args) {
        Apple appleA1 = new Apple("Red", 13);
        appleA1.setColor("Blue");
        appleA1.setPrice(123);
        System.out.println(appleA1);

        int applePrice = appleA1.getPrice();
        System.out.println(applePrice);

        String appleColor = appleA1.getColor();
        System.out.println(appleColor);
    }
}

class Apple {
    String color;
    int price;

    // 建構式
    public Apple(String color, int price) {
        this.color = color;
        this.price = price;
    }

    // set, get

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // toString

    @Override
    public String toString() {
        return "Color" + color + " Price" + price;
    }
}