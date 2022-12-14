public class Main3 {
}
class Person {
    String name;
    int age = 25;

    public Person() {

    }
    public Person(String name) {
        this();// this -> 建構式
        setName(name);
    }

    public Person(String name, int age) {
//        Person(name); // 原 class 裏面 不能直接用建構式
        this(name);
        setAge(age);
    }

    public String show() {
        return name + " " + age + " " ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}