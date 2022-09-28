public class Main2 {
    public static void main(String[] args) {
        Cat cat = new Cat("Taiwan", "Cat");
        System.out.println(cat.getCountry());
        System.out.println(cat);
        cat.shoot();
        cat.extendsShoot();
    }
}

class Animal2 {

    Animal2() {

    }

    Animal2(String country) {
        this.country = country;
    }
    private String country;

    public String getCountry() {
        return country;
    }
    public void shoot () {
        System.out.println("Animal2");
    }
}

class Cat extends Animal2{
    private String name;

    private double price;

    private int age;

    Cat() {

    }

    Cat(String country, String name) {
        super(country);
        this.name = name;
    }

//    @Override
//    public void shoot(String message) {
//        System.out.println("ABC");
//    }

    public void extendsShoot() {
        super.shoot();
    }

    public void shoot() {
        System.out.println(12345);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", country=" + super.getCountry() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}