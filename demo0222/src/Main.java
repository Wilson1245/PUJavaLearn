import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Wilson", 12, "Test", true);
        System.out.println(person);
//        person.setName("Wilson");
//        System.out.println(person.getName());
//        int result = person.addMath(10, 15);
//        System.out.println(result);
//        String str = "Hello";
//        float f = 123.1234f;
//        System.out.printf("%s", str);
//        System.out.println();
//        System.out.printf("%.3f", f);

        // && and, || or, +, -, *, /, % 餘數

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a > 0 && a > b) {
//            System.out.println("Win");
//        } else if (a < b || b > 0){
//            System.out.println("False");
//        }

//        for (int i = 0; i < 10 ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int item[] = {1,2,3,4,5,6,7,8,9};
//        for (int i : item) {
//            System.out.print(i);
//        }

//        int item1[] = {1,2};
//        int item2[] = new int[100];
//        System.out.println(item2.length);
//
//        System.out.println(item1[1]);

    }
}

class Person {

    // 成員變數
    private String name;

    private Integer age;

    private String content;

    private Boolean gender;

    // Constructor
    public Person () {}

    public Person(String name, Integer age, String content, Boolean gender) {
        this.name = name;
        this.age = age;
        this.content = content;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' +
                ", age=" + age +
                ", content='" + content + '\'' +
                ", gender=" + gender +
                '}';
    }

    // Function
    // getter & setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int addMath(int a, int b) {
        int c = a + b;
        return c;
    }
}