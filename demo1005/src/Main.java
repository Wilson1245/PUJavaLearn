public class Main {
    public static void main(String[] args) {
//        Person tom = new Person();
//        Person wilson = new Person("Wilson", true, 3, "White");
//        System.out.println(wilson);
//        System.out.println("Tom : " + tom);
//        tom.setName("Tom");
//        tom.setAge(20);
//        tom.setGender(false);
//        tom.setColor("Black");
//        System.out.println("After Tom : " + tom);
//
//        int wilsonAge = wilson.getAge();
//        int tomAge = tom.getAge();
//        if (wilsonAge > tomAge) {
//            System.out.println("Wilson 比較大");
//        } else {
//            System.out.println("Tom 比較大");
//        }

        Person person = new Person();
    }
}

class Study{
    public void studying() {
        System.out.println("studying");
    }
}

class Person{

//    @Override
//    public void studying() {
//        System.out.println("Person studying.");
//    }
    //  成員變數
    private String name;
    private boolean gender;
    private int age;
    private String color;

    // 當沒有自訂建構式時，預設是空建構式
    // 空建構式
    Person() {

    }

    // 自訂建構式
    Person(String name, boolean gender, int age, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Is gender ? Yes / No
    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Age : " + age + " Gender : " + gender;
    }
}