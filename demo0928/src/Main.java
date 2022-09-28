public class Main {
    public static void main(String[] args) {
        Person wuweicheng = new Person();

        Person tom = new Person("Tom", false, 40, "White");
        String tomName = tom.getName();
        tom.run("run run");
        System.out.println(tomName);
        System.out.println(tom);

        Animal koala = new Animal();
        koala.setName("Koala");
        koala.setGender(true);
        koala.setAge(9);

        System.out.println(koala);
    }
}

class Person {

    private String name;
    private boolean gender;
    private int age;
    private String color;

    Person() {

    }

    Person(String name, boolean gender, int age, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Gender : " + gender;
    }

    public void run(String message) {
        System.out.println("run : " + message);
    }
}

class Animal {
    String name;
    boolean gender;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Age : " + age;
    }
}