public class Main {
    public static void main(String[] args) {

        // 1. if , if...else, if...else if
        // 2. for
        // 3. while, do...while
        // 4. switch

        // 1. if
//        int x = 3;
//        if (x != 2) {
//            System.out.println("Yes");
//        }
//        System.out.println("No");

        // 1. if...else
//        int x1 = 3;
//        if (x1 <= 2) {
//            System.out.println("Yes");
//
//            // 1. if...else if...
//        } else if (x1 >= 3){
//            System.out.println("No");
//        } else {
//            System.out.println("N");
//        }

        // 2. for
        // i++ -> i = i + 1;
        // i-- -> i = i - 1;
//        for (int i = 0; i < 5;) {
//            System.out.println(i);
//            i++;
//        }

//        for (;;) {
//            System.out.println("1");
//            break;
//        }

        // while(boolean) {} 先比較在執行
//        int x1 = 1;
//        while(x1 < 2) {
//            System.out.println("1");
//            x1++;
//        }
        // do...while 先執行在比較
//        do {
//            System.out.println("1");
//            x1++;
//        }while(x1 < 3);


        // switch
        // switch 能放入得 Datatype char, byte, short, int, String
//        char c = 'd';
//        switch (c) {
//            case 'a':
//                System.out.println("a");
//                break;
//            case 'b':
//                System.out.println("b");
//                break;
//            case 'c':
//                System.out.println("c");
//                break;
//            default:
//                System.out.println("Nothing");
//        }

        Person person1 = new Person();
        person1.setName("Tom");
        person1.setAge(11);
        Person person2 = new Person("Wilson", 3);

        System.out.println(person1);
        System.out.println(person2);

        String personName = person1.getName();
        System.out.println(personName);
    }
}

class Person {
    String name;
    int age;

    // 建構式
    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Set
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString
    public String toString() {
        return "Name : " + name + ", Age : " + age;
    }
}